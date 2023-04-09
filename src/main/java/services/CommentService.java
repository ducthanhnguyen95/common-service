package services;

import model.Comment;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import proxies.CommentNotificationProxy;
import repositories.CommentRepository;

@Service
public class CommentService {

    private final CommentRepository commentRepository;
//
//    private final CommentNotificationProxy commentNotificationProxy;
//
//    //    We would have to use @Autowired if the class had more than one constructor.
////    @Autowired
////     */
    public CommentService(CommentRepository commentRepository) {
        this.commentRepository = commentRepository;
    }
//
//
//    public void publishComment(Comment comment) {
//        commentRepository.storeComment(comment);
//        commentNotificationProxy.sendComment(comment);
//    }

    public CommentRepository getCommentRepository() {
        return commentRepository;
    }
}
