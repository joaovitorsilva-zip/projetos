import java.util.Scanner;
public class Idade {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        int anoNascimento, anoAtual, idade;
        System.out.println("Digite o ano de nascimento: ");
        anoNascimento = scanner.nextInt();
        System.out.println("Digite o ano atual: ");
        anoAtual = scanner.nextInt();
        idade = anoAtual - anoNascimento;

        if (idade >= 16){
            System.out.println("Pode votar");
        } else {
            System.out.println("Não pode votar");
        }
        if (idade >= 18){
            System.out.println("Pode dirigir");
        }else{
            System.out.println("Não pode dirigir");
            scanner.close();
        }
        }
        }
