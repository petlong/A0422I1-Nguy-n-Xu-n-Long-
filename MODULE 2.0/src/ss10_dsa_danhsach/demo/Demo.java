package ss10_dsa_danhsach.demo;

import java.util.ArrayList;
import java.util.List;

public class Demo {
    public static void main(String[] args) {
        List<String> strings = new ArrayList<>();
        strings.add("Hanoi");
        strings.add("Hochiminh");
        strings.add("Camau");
        strings.add(1, "Danang");

//        for (int i = 0; i < strings.size(); i++) {
//            System.out.println(strings.get(i));
//        }
//        for (String st: strings) {
//            System.out.println(st);
//        }
//        Iterator<String> iterator = strings.iterator();
//        while (iterator.hasNext()) {
//            String st = iterator.next();
//            System.out.println(iterator.next());
//        }

        List<String> list = (List<String>) ((ArrayList)strings).clone();
        List<String> list2 = strings;
        strings.add("Soctrang");
        list2.stream().forEach(System.out::println);

    }
}
