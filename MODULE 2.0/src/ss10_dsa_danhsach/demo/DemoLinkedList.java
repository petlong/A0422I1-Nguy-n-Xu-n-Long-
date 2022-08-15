package ss10_dsa_danhsach.demo;

import java.util.LinkedList;
import java.util.List;

public class DemoLinkedList {
    public static void main(String[] args) {
        List<String> strings = new LinkedList<>();
        strings.add("Hanoi");
        strings.add("Hochiminh");
        strings.add("Camau");
        strings.add(1, "Danang");

        for (int i = 0; i < strings.size(); i++) {
            System.out.println(strings.get(i));
        }
//        for (String st: strings) {
//            System.out.println(st);
//        }
//        Iterator<String> iterator = strings.iterator();
//        while (iterator.hasNext()) {
//            String st = iterator.next();
//            System.out.println(iterator.next());
//        }
    }
}
