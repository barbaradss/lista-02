public class StringLog {
    public static void main(String[] args) {
        String[] logPedidos = {
                "Pedido 12345 feito por Ana Silva encontra-se com status ENTREGUE.",
                "Pedido 12346 feito por Bruno Costa encontra-se com status PROCESSANDO.",
                "Pedido 12347 feito por Carlos Souza encontra-se com status CANCELADO.",
                "Pedido 12348 feito por Daniela Lima encontra-se com status PROCESSANDO.",
                "Pedido 12349 feito por Eduardo Alves encontra-se com status ENTREGUE.",
                "Pedido 12350 feito por Fernanda Rocha encontra-se com status PROCESSANDO.",
                "Pedido 12351 feito por Gabriel Martins encontra-se com status ENVIADO.",
                "Pedido 12352 feito por Helena Pires encontra-se com status PROCESSANDO."
        };
        for (int i = 0; i < logPedidos.length; i++){
            if (logPedidos[i].contains("PROCESSANDO")){
                System.out.println(logPedidos[i]);
            }
        }
    }
}
