public class exercicio06 {
    public static void main(String[] args) {
        int[] lista = {4,5,7,3,1,34,12,7,19,27};

        int maior = lista[0];
        int menor = lista[0];
        int soma = 0;

        for(int i = 0; i< lista.length; i++){
            soma += lista[i];

            if(lista[i]<menor){
                menor = lista[i];
            }

            if (lista[i]>maior){
                maior = lista[i];
            }
        }
        double media = (double) soma / lista.length;

        System.out.println("Menor valor: " + menor);
        System.out.println("Maior valor: " + maior);
        System.out.println("Soma total: " + soma);
        System.out.println("Média dos valores: " + media);
    }
}
