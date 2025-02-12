import java.util.Scanner;

public class Soma{
    public static void main(String[] args){
        Scanner imput = new Scanner(System.in);
        int num1;
        int num2;
        int sum;
        System.out.println("Coloca o primeiro numero");
        num1 = imput.nextInt();
        System.out.println("coloca o segundo numero");
        num2 = imput.nextInt();
        sum = num1 + num2;
        System.out.printf("O resultado de %d com %d e exatamente %d", num1, num2, sum);

        imput.close();
    }
}