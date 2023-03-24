package services;

import model.Comment;
import proxies.CommentNotificationProxy;
import repositories.CommentRepository;

public class CommentService {

    private CommentRepository commentRepository;

    private CommentNotificationProxy commentNotificationProxy;

//    /*
//    We would have to use @Autowired if the class had more than one constructor.
//    @Autowired
//     */
    public CommentService (CommentRepository commentRepository, CommentNotificationProxy commentNotificationProxy) {
        this.commentRepository = commentRepository;
        this.commentNotificationProxy = commentNotificationProxy;
    }

    public void publishComment(Comment comment) {
        commentRepository.storeComment(comment);
        commentNotificationProxy.sendComment(comment);
    }
}
