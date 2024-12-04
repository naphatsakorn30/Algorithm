package Factorial;
import java.util.Scanner;

class  factorial{
    public static void main(String[] args) {
    Scanner scanIn = new Scanner (System.in);
    System.out.println("Enter a factorial numbre:");
    int n = scanIn.nextInt();
    scanIn.close();

    int factorial = 1;
    for(int i = 1; i <= n; i++){
        System.out.println(i + "! =" +factorial ); 
        factorial += factorial *i;
    }
    }
}