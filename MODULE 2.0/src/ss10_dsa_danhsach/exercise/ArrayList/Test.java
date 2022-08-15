package ss10_dsa_danhsach.exercise.ArrayList;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(0);
        arrayList.add(1);
        arrayList.add(2);

        System.out.println("elements: " + arrayList);
        System.out.println("element 0: " + arrayList.get(0));

        arrayList.add(1,3);
        System.out.println("elements: " + arrayList);

        ArrayList<Integer> arrayList1 = new ArrayList<>();
        
        arrayList1.add(4);
        arrayList1.add(5);
//        arrayList1.addAll(arrayList);
        arrayList1.addAll(1,arrayList);
        System.out.println("elements ArrayList1: " + arrayList1);

        arrayList1.clear();
        System.out.println("elements ArrayList1: " + arrayList1);

        ArrayList<Integer> arrayList2 = new ArrayList<>();
        arrayList2 = (ArrayList<Integer>)arrayList.clone();
        System.out.println("elements ArrayList2: " + arrayList2);

        int elementRemove = arrayList2.remove(1);
        System.out.println("element remove: " + elementRemove);
        System.out.println("elements ArrayList2: " + arrayList2);

        System.out.println("phần tử 5 có trong mảng ArrayList2 không: " + arrayList2.contains(5));
        System.out.println("phần tử 2 ở vị trí index" + arrayList2.indexOf(2));
    }
}
