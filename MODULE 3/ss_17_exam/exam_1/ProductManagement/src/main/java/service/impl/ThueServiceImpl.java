package service.impl;

import model.Thue;
import repository.IThueRepository;
import repository.impl.ThueRepositoryImpl;
import service.IThueService;

import java.util.List;

public class ThueServiceImpl implements IThueService {
    private IThueRepository thueRepository = new ThueRepositoryImpl();

    @Override
    public List<Thue> findAll() {
        return thueRepository.findAll();
    }

    @Override
    public boolean save(Thue thue) {
        return thueRepository.save(thue);

    }

    @Override
    public boolean delete(int id) {
        return thueRepository.delete(id);
    }

    @Override
    public List<Thue> search(String searchId, String searchName, String searchPhone) {
        return thueRepository.search(searchId,searchName,searchPhone);
    }

}
