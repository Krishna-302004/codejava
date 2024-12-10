
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import javax.swing.*;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter number");
        int flag = 0;
        int n = sc.nextInt();
        for (int i = 2; i <= (n/2); i++) {
            if (n % i == 0) {
                flag = 1;
                break;
            }
        }
            if (flag == 1) {
                System.out.print("not a prime");
            } else {
                System.out.print("is a prime");
            }

    }
}



