import java.util.Scanner;

public class Factorial {
    public static int FirstFactorial(int num) {
        int factorial =1;

        if (num==0){
            return 1;
        }else{
            return num*factorial*(num-1);
        }
    }

    public static void main (String[] args) {
        // keep this function call here
        Scanner s = new Scanner(System.in);
        System.out.print(FirstFactorial(s.nextInt()));
    }
}
