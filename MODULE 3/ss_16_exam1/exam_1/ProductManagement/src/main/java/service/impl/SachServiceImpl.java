package service.impl;

import model.Sach;
import repository.ISachRepository;
import repository.impl.SachRepositoryImpl;
import service.ISachService;

import java.util.List;

public class SachServiceImpl implements ISachService {
    private ISachRepository sachRepository = new SachRepositoryImpl();
    @Override
    public List<Sach> findAll() {
        return sachRepository.findAll();
    }

}
