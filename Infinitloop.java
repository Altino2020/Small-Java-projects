import java.util.Scanner;
public class Infinitloop{
    public static void main(String [] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Bem vido ao programa para ver maior numero");
        int numero=0;
        int maior=-999999;
        int menor=999999;
        while(numero<=0||numero>0){
            numero=scan.nextInt();
            if(numero==-1){
                break;
            }
            if(numero>maior){
                maior=numero;
            }
            if(numero<menor){
                menor=numero;
            }
        }
        System.out.printf("O maior numero e %d%nO menor Numero e %d", maior, menor);
        scan.close();
    }
}