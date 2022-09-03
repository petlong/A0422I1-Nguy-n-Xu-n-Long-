package ss16_text_file.exercise.read_file;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class FileRead {
    public static final String DELIMITER = ",";
    public static final String EMPTY = "";

    public static List<Country> getCountry(String path) {
        List<Country> countries = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(path))){
            String temp;
            while ((temp = reader.readLine()) != null) {
                if (EMPTY.equals(temp.trim())) {
                    continue;
                }
                String[] result = temp.split(DELIMITER);
                if (result.length != 3) {
                    continue;
                }
                int id = Integer.parseInt(result[0]);
                String code = result[1];
                String name = result[2];
                countries.add(new Country(id, code, name));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return countries;
    }

}
