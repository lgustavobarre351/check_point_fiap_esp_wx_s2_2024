import java.util.concurrent.ThreadLocalRandom;

/**
 * Classe que gera sequências aleatórias de nucleotídeos.
 */
public class RandomNucleotideGenerator implements NucleotideoRandomGenerator {

    private static final char[] NUCLEOTIDES = {'A', 'C', 'T', 'G'};

    /**
     * Gera uma sequência aleatória de nucleotídeos do tamanho especificado.
     *
     * @param sequenceSize o tamanho da sequência a ser gerada
     * @return uma sequência aleatória de nucleotídeos
     * @throws IllegalArgumentException se sequenceSize for negativo
     */
    @Override
    public String generate(int sequenceSize) {
        if (sequenceSize < 0) {
            throw new IllegalArgumentException("O tamanho da sequência deve ser não negativo");
        }

        StringBuilder sequence = new StringBuilder(sequenceSize);
        for (int i = 0; i < sequenceSize; i++) {
            sequence.append(NUCLEOTIDES[ThreadLocalRandom.current().nextInt(NUCLEOTIDES.length)]);
        }
        return sequence.toString();
    }
}