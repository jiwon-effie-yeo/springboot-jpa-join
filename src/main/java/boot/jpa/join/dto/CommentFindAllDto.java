package boot.jpa.join.dto;

import boot.jpa.join.domain.comment.Comment;
import lombok.Getter;


@Getter
public class CommentFindAllDto {

    private Long id;

    private String comment;

    private Long post_id;

    private Long user_id;

    public CommentFindAllDto(Comment comment){
        this.id = comment.getId();
        this.comment = comment.getComment();
        this.post_id = comment.getPost().getId();
        this.user_id = comment.getUser().getId();
    }
}
