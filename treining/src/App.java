public class App {
    public static void main(String[] args) throws Exception {
        Personal cliente1 = new Personal();
        cliente1.nome="Joao Nunes Alem";
        cliente1.idade=45;
        cliente1.altura=193;
        cliente1.residencia="ASA";
        
        System.out.printf("O %s tem %d anos, %d de altura e reside em %s%n", cliente1.nome, cliente1.idade, cliente1.altura, cliente1.residencia);
    }
}
