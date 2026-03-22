import java.util.Scanner;
public class imc {
    public static void main (String[]args){
   
    Scanner sc = new Scanner(System.in);
    double peso;
    double altura;
    double imc;
    System.out.println("Digite seu peso:");
    peso = sc.nextDouble();
    System.out.println("Digite sua altura:");
    altura = sc.nextDouble();
    imc = peso / (altura * altura); 
    System.out.println("IMC:"+imc);
    if (imc < 18.5) {
    } else if (imc < 25) {

    } else if (imc < 30) {

    } else {

    }
    sc.close();
}
}
