package boot.jpa.join.dto;

import boot.jpa.join.domain.post.Post;
import lombok.Getter;
import java.util.List;
import java.util.stream.Collectors;

@Getter
public class PostFindAllDto {

    private Long id;

    private String title;

    private String content;

    private Long user;

    private List<CommentFindAllDto> comments;

    public PostFindAllDto(Post post){
        this.id = post.getId();
        this.title = post.getTitle();
        this.content = post.getContent();
        this.user = post.getUser().getId();
        this.comments = post.getComments().stream()
                .map(CommentFindAllDto::new)
                .collect(Collectors.toList());
    }//순환참조 방지 (user를 long타입으로 받아주기)
}
