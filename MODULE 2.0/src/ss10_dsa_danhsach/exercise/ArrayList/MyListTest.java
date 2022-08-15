package ss10_dsa_danhsach.exercise.ArrayList;

public class MyListTest {
    public static void main(String[] args) {
        MyList<Integer> list = new MyList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        System.out.println("element 1: "+list.get(1));

//        list.remove(1);
//        System.out.println("element 1: "+list.get(1));

        list.add(3,5);
        System.out.println("element 3: "+list.get(3));

        System.out.println("the number of elements in this list: " + list.size());

        MyList<Integer> listClones;
        listClones =list.clone();
        System.out.println(" element 1 of listClone:" + listClones.get(1));
    }
}
