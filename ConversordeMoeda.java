import java.util.Scanner;
public class ConversordeMoeda {
public static void main(String[]args){
    Scanner sc = new Scanner (System.in);

    double reais;
    double cotacao;
    double convertido;
    System.out.println("Digite o valor em reais: ");
    reais = sc.nextDouble();
    System.out.println("Digite a cotacao do dolar: ");
    cotacao = sc.nextDouble();
    convertido = reais / cotacao;
    System.out.println("Valor em dolar:" + convertido);
    sc.close();
}    
}
