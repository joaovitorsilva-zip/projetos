import java.util.Scanner;
public class Inteiro {
    public static void main(String[]args){
    Scanner scanner = new Scanner (System.in);
    int num;
    System.out.println("Digite o numero: ");
    num = scanner.nextInt();
    if (num >= 0) {
        System.out.println("Positivo");
     } else {
        System.out.println("Negativo");
     }
        scanner.close();
        
    }
    
}
