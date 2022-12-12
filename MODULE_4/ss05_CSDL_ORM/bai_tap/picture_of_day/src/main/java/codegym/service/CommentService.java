package codegym.service;

import codegym.bean.Comment;
import codegym.repository.ICommentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CommentService implements ICommentService {

    @Autowired
    private ICommentRepository iCommentRepository;

    @Override
    public List<Comment> findAll() {
        return iCommentRepository.findAll();
    }

    @Override
    public void comment(Comment comment) {
        iCommentRepository.comment(comment);
    }

    @Override
    public void like(int id) {
        iCommentRepository.like(id);
    }
}
