import java.util.HashMap;
import java.util.Map;


public class Filtragem {
    public static void main(String[] args) {

        HashMap<String, Double> produtos = new HashMap<>();

        produtos.put("Mouse", 45.00);
        produtos.put("Teclado", 120.00);
        produtos.put("Monitor", 850.00);
        produtos.put("Pendrive", 30.00);
        produtos.put("Headset", 220.00);

        for (Map.Entry<String, Double>entry : produtos.entrySet()){
            if (entry.getValue() > 50.00){
                System.out.println(entry.getKey() + " R$ " + entry.getValue());
            }
        }
    }
}
