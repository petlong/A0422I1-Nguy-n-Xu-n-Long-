package service.impl;

import model.ThanhToan;
import repository.IThanhToanRepository;
import repository.impl.ThanhToanRepositoryImpl;
import service.IThanhToanService;

import java.util.List;

public class ThanhToanServiceImpl implements IThanhToanService {
    private IThanhToanRepository categoryRepository = new ThanhToanRepositoryImpl();
    @Override
    public List<ThanhToan> findAll() {
        return categoryRepository.findAll();
    }

}
