import java.util.Scanner;
public class Triangulo {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        double A, B, C;
        System.out.println("Digite o valor de A: ");
        A = scanner.nextDouble();
        System.out.println("Digite o valor de B: ");
        B = scanner.nextDouble();
        System.out.println("Digite o valor de C: ");
        C = scanner.nextDouble();

        if (A + B> C && B + C > A && C + A > B){
            System.out.println("Forma um triangulo");
        }else {
            System.out.println("Não forma um triangulo");
            scanner.close();
        }
        }
    }

