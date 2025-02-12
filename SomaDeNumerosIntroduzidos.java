import java.util.Locale;
import java.util.Scanner;

public class SomaDeNumerosIntroduzidos{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        System.out.println("Coloca inteiro");
        int valor = scan.nextInt();
        int soma=0;
        while(valor>0){
            soma+=valor;
            valor=scan.nextInt();
        }
        System.out.printf("Valor e %d", soma);
        scan.close();
    }
}