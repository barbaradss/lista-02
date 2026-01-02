import java.util.ArrayList;
import java.util.Scanner;

public class MenuSwitch {
    public static void main(String[] args) {
        ArrayList<String> objetos = new ArrayList<String>();
        Scanner sc = new Scanner(System.in);
        int opcao;


        do {

            System.out.println("Insira a opção:");
            System.out.println("1-Adicionar");
            System.out.println("2-Listar");
            System.out.println("3-Sair");
            System.out.print(">");

            opcao = sc.nextInt();
            sc.nextLine();

            switch (opcao){
                case 1:
                    System.out.println("Digite o que vai adicionar");
                    String objeto = sc.nextLine();
                    objetos.add(objeto);
                    System.out.println("Objeto adicionado");
                    break;
                case 2:
                    System.out.println("Lista");
                    System.out.println(objetos);
                    break;
                case 3:
                    System.out.println("Saindo do programa...");
                    break;
                default:
                    System.out.println("Operação inválida");
            }
        }while(opcao != 3);

        sc.close();
    }
}
