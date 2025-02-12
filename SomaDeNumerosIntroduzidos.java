import java.util.Scanner;
import java.util.Locale;

public class SomaDeNumerosIntroduzidos{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        System.out.println("Coloca inteiro");
        int valor = scan.nextInt();
        int soma=0;
        while(valor>5){
            soma+=valor;
            valor=scan.nextInt();
        }
        System.out.printf("Valor e %d", soma);
        scan.close();
    }
}