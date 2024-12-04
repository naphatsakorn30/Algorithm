package value;

import java.util.Scanner;

public class value {
public static void main(String[] args) {   
    Scanner  scanIn = new Scanner(System.in);
    System.out.print("value");
    int a = scanIn.nextInt();
    int b = scanIn.nextInt();
    int c = scanIn.nextInt();
    int max; 
    if (a >= b && a >= c) 
    {
        max = a;
    } else if (b >= c) 
    {
        max = b;
    } else 
    {
        max = c;
    }
    System.out.println(max) ; 
    scanIn.close(); 
 }
    
}