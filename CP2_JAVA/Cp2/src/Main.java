import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        NucleotideoRandomGenerator generator = new RandomNucleotideGenerator();

        System.out.print("Digite o tamanho da sequência: ");
        int sequenceSize = scanner.nextInt();

        System.out.println("Sequência gerada: " + generator.generate(sequenceSize));
        
        scanner.close();
    }
}