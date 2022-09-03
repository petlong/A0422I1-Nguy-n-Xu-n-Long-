package ss19_string.exercise.validate_name_class;

public class NameClassTest {
    private static NameClass nameClass;

    public static final String[] name = new String[] { "C0318G", "M0318G", "P0323A" };

    public static void main(String args[]) {
        nameClass = new NameClass();
        for (String name : name) {
            boolean isvalid = nameClass.validate(name);
            System.out.println("Account is " + name +" is valid: "+ isvalid);
        }
    }
}
