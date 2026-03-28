import java.util.Scanner;
public class Parouimpar {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        int num;
        System.out.println("Digite o numero: ");
        num = scanner.nextInt();
        if (num % 3 == 0 && num % 5 == 0){
            System.out.println("É multiplo de 3 e 5");
        } else {
            System.out.println("Não é multiplo de 3 e 5");
            scanner.close();
        }
        }
    }

