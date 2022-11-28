package service.impl;

import model.HocSinh;
import repository.IHocSinhRepository;
import repository.impl.HocSinhRepositoryImpl;
import service.IHocSinhService;

import java.util.List;

public class HocSinhServiceImpl implements IHocSinhService {
    private IHocSinhRepository hocSinhRepository = new HocSinhRepositoryImpl();
    @Override
    public List<HocSinh> findAll() {
        return hocSinhRepository.findAll();
    }

}
