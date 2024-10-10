/**
 * Interface para geradores de sequências aleatórias de nucleotídeos.
 */
public interface NucleotideoRandomGenerator {

    /**
     * Gera uma sequência aleatória de nucleotídeos do tamanho especificado.
     *
     * @param sequenceSize o tamanho da sequência a ser gerada
     * @return uma sequência aleatória de nucleotídeos
     * @throws IllegalArgumentException se sequenceSize for negativo
     */
    String generate(int sequenceSize);
}