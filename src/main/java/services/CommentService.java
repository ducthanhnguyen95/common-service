package services;

import org.springframework.stereotype.Service;
import repositories.CommentRepository;
import repositories.DBCommentRepository;

@Service
public class CommentService {

    private final DBCommentRepository dbCommentRepository;


    public CommentService(DBCommentRepository dbCommentRepository) {
        this.dbCommentRepository = dbCommentRepository;
    }

    public CommentRepository getCommentRepository() {
        return dbCommentRepository;
    }
}
