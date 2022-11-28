package codegym.vn.service;

import org.springframework.stereotype.Service;

@Service
public class ConverterServiceImp implements IConverterService {
    @Override
    public double convert(double amount) {
        double result;
        result = amount*2400;
        return result;
    }
}
