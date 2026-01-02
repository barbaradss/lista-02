import java.util.Scanner;

public class SomaDoWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n;
        int soma = 0;
        do {
            System.out.println("Digite um número maior que zero");
            n = sc.nextInt();

            if(n>0){
                soma += n;
            }
        } while (n > 0);
        System.out.println("A soma dos números é "+ soma);
    }
}
