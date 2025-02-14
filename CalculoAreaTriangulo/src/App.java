/*Com o programa pretende-se construir um pequeno programa que calcula a area de dois triangulos e imprime qual deles tem a maior area*/
import java.util.Locale;
import java.util.Scanner;
public class App {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Triangulo primeiro, segundo;
        primeiro=new Triangulo();
        segundo=new Triangulo();
        System.out.println("Coloca os lados do primeiro triangulo");
        primeiro.lado1=sc.nextDouble();
        primeiro.lado2=sc.nextDouble();
        primeiro.lado3=sc.nextDouble();
        System.out.println("Coloca os lados do segundo triangulo");
        segundo.lado1=sc.nextDouble();
        segundo.lado2=sc.nextDouble();
        segundo.lado3=sc.nextDouble();

        double areaPrimeiro=primeiro.area();
        double areaSegundo=segundo.area();

        System.out.printf("A area do primeiro triangulo e de %.2f%n", areaPrimeiro);
        System.out.printf("A area do segundo triangulo e de %.2f%n", areaSegundo);

        if(areaPrimeiro>areaSegundo){
            System.out.println("Maior e Primeiro");
        }
        else{
            System.out.println("Maior e segundo");
        }
        sc.close();
    }
}
