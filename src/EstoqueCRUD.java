import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class EstoqueCRUD {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        HashMap<Integer, String[]> estoque = new HashMap<>();

        int opcao;

        do {
            System.out.println("===== MENU =====");
            System.out.println("1 - Adicionar Produto");
            System.out.println("2 - Visualizar Todos");
            System.out.println("3 - Buscar por Código");
            System.out.println("4 - Atualizar Produto");
            System.out.println("5 - Remover Produto");
            System.out.println("0 - Sair");
            System.out.print("Opção: ");

            opcao = sc.nextInt();

            switch (opcao) {


                case 1:
                    System.out.print("Código: ");
                    int codigo = sc.nextInt();

                    if (estoque.containsKey(codigo)) {
                        System.out.println("Erro: código já existe");
                        break;
                    }

                    sc.nextLine();
                    System.out.print("Nome: ");
                    String nome = sc.nextLine();

                    System.out.print("Quantidade: ");
                    int quantidade = sc.nextInt();
                    if (quantidade < 0) {
                        System.out.println("Erro: quantidade não pode ser menor que 0");
                        break;
                    }

                    System.out.print("Preço: ");
                    double preco = sc.nextDouble();
                    if (preco <= 0) {
                        System.out.println("Erro: preço deve ser maior que 0");
                        break;
                    }

                    estoque.put(codigo, new String[]{
                            nome,
                            String.valueOf(quantidade),
                            String.valueOf(preco)
                    });

                    System.out.println("Produto adicionado com sucesso");
                    break;


                case 2:
                    if (estoque.isEmpty()) {
                        System.out.println("Estoque vazio");
                        break;
                    }

                    int contador = 0;
                    for (Map.Entry<Integer, String[]> item : estoque.entrySet()) {
                        String[] p = item.getValue();

                        System.out.println(
                                "Código: " + item.getKey() +
                                        " | Nome: " + p[0] +
                                        " | Qtd: " + p[1] +
                                        " | Preço: " + p[2]
                        );

                        contador++;
                        if (contador % 5 == 0) {
                            System.out.print("Pressione ENTER para continuar...");
                            sc.nextLine();
                            sc.nextLine();
                        }
                    }
                    break;

                case 3:
                    System.out.print("Código: ");
                    codigo = sc.nextInt();

                    if (!estoque.containsKey(codigo)) {
                        System.out.println("Erro: código não existe");
                        break;
                    }

                    String[] p = estoque.get(codigo);
                    System.out.println("Nome: " + p[0]);
                    System.out.println("Quantidade: " + p[1]);
                    System.out.println("Preço: " + p[2]);
                    break;


                case 4:
                    System.out.print("Código: ");
                    codigo = sc.nextInt();

                    if (!estoque.containsKey(codigo)) {
                        System.out.println("Erro: código não existe");
                        break;
                    }

                    String[] atual = estoque.get(codigo);
                    double precoAtual = Double.parseDouble(atual[2]);

                    sc.nextLine();
                    System.out.print("Novo Nome: ");
                    nome = sc.nextLine();

                    System.out.print("Nova Quantidade: ");
                    quantidade = sc.nextInt();
                    if (quantidade < 0) {
                        System.out.println("Erro: quantidade não pode ser menor que 0");
                        break;
                    }

                    System.out.print("Novo Preço: ");
                    preco = sc.nextDouble();
                    if (preco <= 0) {
                        System.out.println("Erro: preço deve ser maior que 0");
                        break;
                    }

                    if (preco > precoAtual * 1.5) {
                        System.out.println("Erro: preço não pode aumentar mais que 50%");
                        break;
                    }

                    estoque.put(codigo, new String[]{
                            nome,
                            String.valueOf(quantidade),
                            String.valueOf(preco)
                    });

                    System.out.println("Produto atualizado com sucesso");
                    break;


                case 5:
                    System.out.print("Código: ");
                    codigo = sc.nextInt();

                    if (!estoque.containsKey(codigo)) {
                        System.out.println("Erro: código não existe");
                        break;
                    }

                    quantidade = Integer.parseInt(estoque.get(codigo)[1]);
                    if (quantidade != 0) {
                        System.out.println("Erro: só pode remover produto com quantidade 0");
                        break;
                    }

                    estoque.remove(codigo);
                    System.out.println("Produto removido com sucesso");
                    break;

                case 0:
                    System.out.println("Saindo...");
                    break;

                default:
                    System.out.println("Opção inválida");
            }

        } while (opcao != 0);

        sc.close();
    }
}
