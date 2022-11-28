package codegym.service;

import codegym.reposirory.IDictionaryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DictionatyServiceImpl implements IDictionatyService {
    @Autowired
    private IDictionaryRepository IDictionaryRepository;

    @Override
    public String translate(String inputWord) {
        return IDictionaryRepository.translate(inputWord);
    }
}
