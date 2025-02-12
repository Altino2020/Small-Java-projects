import java.util.Locale;
import java.util.Scanner;

public class AnoBissestoNormal{
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);
        int ano;
        int mes;
        System.out.println("Coloca um ano");
        ano = scan.nextInt();
        System.out.println("Coloca um mes");
        mes = scan.nextInt();

        if(mes==2){
            if (ano%400==0 || ano%4==0 && ano%100!=0)
            System.out.println("29");
            else
            System.out.println("28");
        }
        else if (mes==4 || mes==6 || mes==9 || mes==11){
            System.out.println("30");
        }
        else
        System.out.printf("31");
        System.out.printf("O mes %d do ano de %d aquele e o valor", mes, ano);
        scan.close();
    }
}