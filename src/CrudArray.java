import java.util.Scanner;

public class CrudArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcao;
        int[] dados = new int[5];
        int contadorElementos = 0;

        do{
            System.out.println("=== MENU ===");
            System.out.println("1 - Adicionar");
            System.out.println("2 - Visualizar");
            System.out.println("3 - Atualizar");
            System.out.println("4 - Remover");
            System.out.println("0 - Sair");
            System.out.println("Escolha uma opção");
            System.out.print(">");
            opcao = sc.nextInt();

            switch (opcao){
                case 1:
                    if (contadorElementos < dados.length){
                        System.out.print("Digite um número: ");
                        dados[contadorElementos] = sc.nextInt();
                        contadorElementos++;
                        System.out.println("Número adicionado com sucesso!");
                    }else{
                        System.out.println("Erro: Array cheio");
                    }
                    break;

                case 2:
                    if (contadorElementos == 0){
                        System.out.println("Nenhum elemento armazenado");
                    }else {
                        System.out.println("Elementos do Array: ");
                        for(int i = 0; i<contadorElementos; i++){
                            System.out.println("Índice " + i + ": " + dados[i]);
                        }
                    }
                    break;

                case 3:
                    System.out.print("Digite o índice (0 a 4): ");
                    int indiceAtualizar = sc.nextInt();
                    if (indiceAtualizar >= 0 && indiceAtualizar < contadorElementos){
                        System.out.println("Digite o novo valor: ");
                        dados[indiceAtualizar] = sc.nextInt();
                        System.out.println("Valor atualizado!");
                    }else {
                        System.out.println("Erro: índice inválido ou posição vazia");
                    }
                    break;

                case 4:
                    System.out.print("Digite o índice para remover (0 a 4): ");
                    int indiceRemover = sc.nextInt();
                    if (indiceRemover >= 0 && indiceRemover < contadorElementos){
                        for (int i = indiceRemover; i < contadorElementos -1; i++){
                            dados[i] = dados [i + 1];
                        }
                        dados[contadorElementos - 1] = 0;
                        contadorElementos--;
                        System.out.println("Elemento removido!");
                    }else{
                        System.out.println("Erro: índice inválido ou posição vazia");
                    }
                    break;

                case 0:
                    System.out.println("Encerrando o sistema...");
                    break;

                default:
                    System.out.println("Opção inválida");
            }
        }while (opcao != 0);

        sc.close();
    }
}
