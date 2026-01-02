import java.util.HashMap;
import java.util.Scanner;

public class PrecoHashMap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        HashMap<String, Double> produtos = new HashMap<>();

        produtos.put("Arroz", 5.50);
        produtos.put("Feijao", 7.20);
        produtos.put("Macarrao", 4.30);
        produtos.put("Leite", 3.80);
        produtos.put("Cafe", 9.90);

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
