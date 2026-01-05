import java.util.HashMap;
import java.util.Scanner;

public class PrecoHashMap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        HashMap<String, Double> produtos = new HashMap<>();

        produtos.put("Mouse", 45.00);
        produtos.put("Teclado", 120.00);
        produtos.put("Monitor", 850.00);
        produtos.put("Pendrive", 30.00);
        produtos.put("Headset", 220.00);

        System.out.println("Digite o produto: ");
        String nomeProduto = sc.nextLine();

        if(produtos.containsKey(nomeProduto)){
            double preco = produtos.get(nomeProduto);
            System.out.println("Preço do produto: R$ " + preco);
        }else{
            System.out.println("Produto não encontrado");
        }
    }
}
