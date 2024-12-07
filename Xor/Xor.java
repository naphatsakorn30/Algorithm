package xor;
import java.util.Scanner;
class XOR {
    public static void main(String[] args) {
        Scanner scanIn = new Scanner(System.in);
        System.out.print("Input a:");
        int p = scanIn.nextInt();
        System.out.print("Input b:");
        int q = scanIn.nextInt();
        scanIn.close();
        if ((a == 0 || a == 1) && (b == 0 || b== 1)) {
            if (a == b) {
                System.out.println(a + " XOR " + b + " = " + 0);
            } else {
                System.out.println(a + " XOR " + b + " = " + 1);
            }
        } else {
            System.out.println("Error");
        }
    }
}