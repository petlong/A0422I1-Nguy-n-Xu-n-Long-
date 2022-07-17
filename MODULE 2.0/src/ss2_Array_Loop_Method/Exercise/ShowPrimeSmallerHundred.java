package ss2_Array_Loop_Method.Practice;

public class ShowPrimeSmallerHundred {
    public static void main(String[] args) {

        System.out.println("prime <100: ");

        for (int i = 2; i < 100; i++) {
            if (checkPrime(i)) {
                System.out.print(i+"\t");
            }
        }
    }

        public static  boolean checkPrime(int n) {
            if(n<2){
                return false;
            }
            if(n==2){
                return true;
            }
            for (int i = 2; i <= Math.sqrt(n); i++) {
                if (n % i == 0) {
                    return false;
                }
            }
            return true;
        }
        }




