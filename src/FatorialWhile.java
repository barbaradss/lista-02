import java.util.Scanner;

public class FatorialWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Insira um número maior que 0");
        int numero = sc.nextInt();

        int resultado = 1 ;

        if (numero > 0){
            while(numero>=1){
                resultado = resultado * numero;
                numero--;
            }
            System.out.println(resultado);
        }else {
            System.out.println("Número inválido");
        }
        
    }
}
