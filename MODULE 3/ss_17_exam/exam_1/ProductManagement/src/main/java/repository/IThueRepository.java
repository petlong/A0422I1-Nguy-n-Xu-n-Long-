package repository;

import model.Thue;

import java.util.List;

public interface IThueRepository {
    List<Thue> findAll();

    boolean save(Thue thue);

    boolean delete(int id);

    List<Thue> search(String searchId, String searchName, String searchPhone);

}


