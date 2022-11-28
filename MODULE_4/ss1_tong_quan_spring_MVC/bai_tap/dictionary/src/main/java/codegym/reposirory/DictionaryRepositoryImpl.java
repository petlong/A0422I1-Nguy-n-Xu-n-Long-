package codegym.reposirory;

import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;

@Repository
public class DictionaryRepositoryImpl implements IDictionaryRepository {
    private static Map<String,String> dictonaryMap;

    static {
        dictonaryMap = new HashMap<>();
        dictonaryMap.put("hello", "Xin chào");
        dictonaryMap.put("how", "Thế nào");
        dictonaryMap.put("book", "Quyển vở");
        dictonaryMap.put("computer", "Máy tính");
    }

    @Override
    public String translate(String inputWord) {
        if(dictonaryMap.containsKey(inputWord))
        return dictonaryMap.get(inputWord);
        else return "Not found";
//        return dictonaryMap.get(inputWord);
    }
}
