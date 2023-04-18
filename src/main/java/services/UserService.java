package services;

import org.springframework.stereotype.Service;
import repositories.CommentRepository;
import repositories.DBCommentRepository;

@Service
public class UserService {

    private final DBCommentRepository dbCommentRepository;


    public UserService(DBCommentRepository dbCommentRepository) {
        this.dbCommentRepository = dbCommentRepository;
    }

    public CommentRepository getCommentRepository() {
        return dbCommentRepository;
    }
}
