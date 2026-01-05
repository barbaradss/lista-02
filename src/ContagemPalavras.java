import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ContagemPalavras {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String frase = sc.nextLine();

        frase = frase.toLowerCase();
        frase = frase.replaceAll("[^a-záéíóúãõâêîôûç, ]", "");

        String[] palavras = frase.split("\\s+");
        HashMap<String, Integer> frequencia = new HashMap<>();

        for (String palavra : palavras) {
            frequencia.put(palavra, frequencia.getOrDefault(palavra, 0) + 1);
        }

        System.out.println("\nFrequência das palavras:");
        for (Map.Entry<String, Integer> entry : frequencia.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());

        }
    }
}
