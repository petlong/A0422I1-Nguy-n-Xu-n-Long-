package ss11_stack_queue.exercise.to_chuc_du_lieu_su_dung_queue;

import java.time.LocalDate;

public class Personal {
    private String name;
    private String sex;
    private LocalDate dateOfBirth;

    public Personal(){}

    public Personal(String name, String sex, LocalDate dateOfBirth) {
        this.name = name;
        this.sex = sex;
        this.dateOfBirth = dateOfBirth;
    }

    public String getName() {
        return name;
    }

    public String getSex() {
        return sex;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public boolean isMale(){
        if(sex.equals("male")){
            return true;
        }
        return false;
    }

    @Override
    public String toString(){
        return "Name:" + name + " Sex:" + sex + " Date of Birth" + dateOfBirth;
    }
}
