import java.util.Scanner;
public class tempo {
    public static void main(String[]args) {
        Scanner sc = new Scanner(System.in);
        int segundosTotais;
        int horas;
        int minutos;
        int segundos;
        System.out.println("Digite o tempo em segundos");
        segundosTotais = sc.nextInt();
        horas = segundosTotais / 3600;
        int resto = segundosTotais % 3600;
        minutos = resto / 60;
        segundos =  resto % 60; 
        System.out.println(horas + "h " + minutos + "m " + segundos + "s");
        sc.close();
    }
}