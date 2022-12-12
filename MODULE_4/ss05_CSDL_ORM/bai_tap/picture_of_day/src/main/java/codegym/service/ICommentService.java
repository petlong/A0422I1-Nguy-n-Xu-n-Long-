package codegym.service;

import codegym.bean.Comment;

import java.util.List;

public interface ICommentService {
    List<Comment> findAll();
    void comment(Comment comment);
    void like(int id);
}
