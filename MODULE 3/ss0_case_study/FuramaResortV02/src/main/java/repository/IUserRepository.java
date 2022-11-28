package repository;

import model.Employee;
import model.Position;
import model.User;

import java.util.List;

public interface IUserRepository {
    List<User> findAll();

    boolean add(User user);
}
