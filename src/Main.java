import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws IOException, InterruptedException {

        System.out.println("Selecione uma das seguintes moedas a ser convertida:");

        // HashMap com chave: String (moeda) e valor: String (texto a ser exibido para o usuário)
        Map<String, String> moedas = new HashMap<String, String>();
        moedas.put("ARS", "ARS  Argentine Peso Argentina");
        moedas.put("BOB", "BOB  Bolivian Boliviano Bolivia");
        moedas.put("BRL", "BRL  Brazilian Real Brazil");
        moedas.put("CAD", "CAD  Canadian Dollar	Canada");
        moedas.put("CLP", "CLP  Chilean Peso Chile");
        moedas.put("COP", "COP  Colombian Peso Colombia");
        moedas.put("EUR", "EUR  Euro European Union");
        moedas.put("MXN", "MXN  Mexican Peso Mexico");
        moedas.put("PEN", "PEN  Peruvian Sol Peru");
        moedas.put("USD", "USD  United States Dollar United States");
        moedas.put("UYU", "UYU  Uruguayan Peso Uruguay");
        moedas.put("VES", "VES  Venezuelan Bolívar Soberano	Venezuela");
        // HashMap com chave: Integer (indice ao qual o usuário utilizará para selecionar a moeda) e valor: String (moeda a ser convertida)
        Map<Integer, String> indicesMoedas = new HashMap<Integer, String>();

        int indice = 1;

        // Itera sobre as chaves/valores do HashMap(moedas) com as moedas e textos a ser exibidos para o usuário
        for (Map.Entry<String, String> entry : moedas.entrySet()) {
            // chave do Map(moedas) atual - ex: "BRL"
            String chave = entry.getKey();
            // valor do Map(moedas) atual - ex: "BRL  Brazilian Real Brazil"
            String texto = entry.getValue();

            // acrescenta a moeda com chave: Integer (indice) e valor: String (moeda) ao HashMap(indicesMoedas)
            indicesMoedas.put(indice, chave);

            System.out.println(indice + " - " + texto);
            indice++;
        }

        // Lê e converte o valor digitado pelo usuário para Integer
        Scanner leitura = new Scanner(System.in);
        String moedaSelecionada = leitura.nextLine();
        Integer indiceMoeda = Integer.valueOf(moedaSelecionada);

        // Busca a moeda no HashMap(indicesMoedas) com base no número digitado pelo usuário;
        String moedaParaConverter = indicesMoedas.get(indiceMoeda);

        System.out.println("Moeda a ser convertida selecionada: " + moedaParaConverter);
        System.out.println("Agora selecione uma das moedas para a conversão");

        indice = 1;

        // Faz uma segunda iteração para listar e selecionar a moeda a qual fará a conversão
        for (Map.Entry<String, String> entry : moedas.entrySet()) {
            String texto = entry.getValue();

            // Se a moeda atual já foi selecionada anteriormente, informará ao usuário que esta moeda já foi selecionada
            if(indiceMoeda == indice) {
                System.out.println("X - " + texto + " ( Já selecionado )");
            }
            else {
                System.out.println(indice + " - " + texto);
            }
            indice++;
        }

        Scanner leitura2 = new Scanner(System.in);
        String moedaSelecionada2 = leitura2.nextLine();
        Integer indiceMoeda2 = Integer.valueOf(moedaSelecionada2);
        String moedaDeConversao = indicesMoedas.get(indiceMoeda2);

        // Instancia a classe para consultar a API
        ConsultaAPI consultaAPI = new ConsultaAPI();

        // Acessa o metódo "buscaCotacao" da classe, passando a moeda para conversão como parâmetro
        // e recebendo os dados da cotação como resposta
        /* Exemplo de resposta:
        * {
        *   conversion_rates: {
        *       "BRL": 1,
        *       "EUR": 0.1727,
        *       ...
        *   }
        * }
        * */
        Moeda resposta = consultaAPI.buscaCotacao(moedaParaConverter);

        System.out.println("Digite o valor para a conversão");
        Scanner leitura3 = new Scanner(System.in);
        String valorDigitado = leitura3.nextLine();
        double valorConversao = Double.parseDouble(valorDigitado);

        // Acessa a propriedade "conversion_rates" dentro da resposta onde, passando a moeda para conversão,
        // retorna o valor da cotação dela
        double cotacao = Double.parseDouble(resposta.conversion_rates().get(moedaDeConversao));

        // Calcula o valor convertido
        double valorConvertido = (valorConversao * cotacao);
        System.out.println("O valor de " + valorConversao + moedaParaConverter + " convertidos para " + moedaDeConversao + " é:");
        System.out.println(valorConvertido);

    }
}