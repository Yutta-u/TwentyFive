import java.util.Scanner;

public class TwentyFive {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int x = scan.nextInt();

        int a = x / 10;
        int b = a + 1;

        if (x < 10) {
            System.out.println("25");
        } else {
            System.out.println(a * b + "25");
        }
    }
}
