import java.util.Scanner;
public class Media {
    public static void main(String[]args){

    Scanner scanner = new Scanner(System.in);
    double m1, m2, media;
    System.out.println("Digite a primeira nota: ");
    m1 = scanner.nextDouble();
    System.out.println("Digite a segunda nota: ");
    m2 = scanner.nextDouble();
    media = (m1 + m2) / 2;
    if (media >=6){
        System.out.println("Aprovado");
    } else {
        System.out.println("Exame");
        scanner.close();
    }
    }
}  
