import java.util.Scanner;
public class Nadador {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        int idade;
        System.out.println("Digite sua idade: ");
        idade = scanner.nextInt();

        if (idade >=18){
            System.out.println("Categoria adulta");
            scanner.close();
        }

    }
}
