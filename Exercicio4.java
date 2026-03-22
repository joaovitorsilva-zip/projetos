public class Exercicio4 {
    public static void main (String[]args) {
        double nota1 = 7.5;
        double nota2 = 3.0;
        double nota3 = 5.5;
        double media = (nota1 + nota2 + nota3) / 2;
        System.out.println("media: " + media);
        if (media >=7) {
            System.out.println ("Aprovado");
        } else if (media >=5) {
            System.out.println ("Recuperação");
        } else {
            System.out.println ("Reprovado");
        }
        }
        }
