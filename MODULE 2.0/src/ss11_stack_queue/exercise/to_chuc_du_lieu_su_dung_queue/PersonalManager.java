package ss11_stack_queue.exercise.to_chuc_du_lieu_su_dung_queue;

import java.time.LocalDate;
import java.util.ArrayDeque;
import java.util.Queue;

public class PersonalManager {
    public static void main(String[] args) {
        Personal[] personals = new Personal[5];
        personals[0] = new Personal("Hung", "male", LocalDate.of(1991,12,2));
        personals[1]= new Personal("Mai", "female", LocalDate.of(1992,6,5));
        personals[2]= new Personal("Dung", "male", LocalDate.of(1993,3,6));
        personals[3]= new Personal("Lan", "female", LocalDate.of(1992,6,7));
        personals[4]= new Personal("Huy", "male", LocalDate.of(1996,3,9));

        Queue personal = new ArrayDeque();
        Queue female = new ArrayDeque();
        Queue male = new ArrayDeque();

        for (Personal p: personals){
            if(p.isMale()){
                male.add(p);
            }else {
                female.add(p);
            }
        }
        while (!male.isEmpty()){
            personal.add(male.remove());
        }
        while (!female.isEmpty()){
            personal.add(female.remove());
        }

        System.out.println(personal.toString());
    }
}
