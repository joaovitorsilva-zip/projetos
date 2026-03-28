import java.util.Scanner;
public class Ordem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int A, B, C;

        System.out.print("Digite A: ");
        A = scanner.nextInt();

        System.out.print("Digite B: ");
        B = scanner.nextInt();

        System.out.print("Digite C: ");
        C = scanner.nextInt();

        if (A <= B && B <= C) {
            System.out.println(A + " " + B + " " + C);
        }

        if (A <= C && C <= B) {
            System.out.println(A + " " + C + " " + B);
        }

        if (B <= A && A <= C) {
            System.out.println(B + " " + A + " " + C);
        }

        if (B <= C && C <= A) {
            System.out.println(B + " " + C + " " + A);
        }

        if (C <= A && A <= B) {
            System.out.println(C + " " + A + " " + B);
        }

        if (C <= B && B <= A) {
            System.out.println(C + " " + B + " " + A);
            scanner.close();
        }
    }
}