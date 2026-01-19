import java.util.regex.Matcher;
import java.util.regex.Pattern;

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
        String regex = "Pedido (\\d+) feito por (.+?) encontra-se com status (\\w+)";

        Pattern pattern = Pattern.compile(regex);
        for (String pedido : logPedidos){
            if (pedido.contains("PROCESSANDO")){
                Matcher matcher = pattern.matcher(pedido);
                if (matcher.find()) {
                    Integer idPedido = Integer.getInteger(matcher.group(1));
                    String usuario = matcher.group(2);
                    String status = matcher.group(3);

                    System.out.println("ID do Pedido: " + idPedido);
                    System.out.println("Usuário: " + usuario);
                    System.out.println("Status: " + status);
                    System.out.println("---");
                }
            }
        }
    }
}
