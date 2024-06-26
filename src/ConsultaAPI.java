import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ConsultaAPI {

    // Chave e URL da API
    private String apiKey = "da72868b1549b6f27f50f954";
    private String apiUrl = "https://v6.exchangerate-api.com/v6/"+ apiKey +"/latest/";

    public Moeda buscaCotacao(String moeda) throws IOException, InterruptedException {

        // Acrescenta a moeda no parâmetro de busca da URL
        String urlRequisicao = apiUrl + moeda;

        // Instância a classe HttpClient e faz a requisição para a APi
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder().uri(URI.create(urlRequisicao)).build();
        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

        // Retorna a resposta em formato JSON como String
        String resposta = response.body();

        // Instância a classe CriaJSON e utiliza do método "respostaParaJson"
        // para converter a resposta da requisição de String para JSON
        CriaJSON criaJSON = new CriaJSON();
        Moeda json = criaJSON.respostaParaJson(resposta);

        // Retorna a resposta em JSON
        return json;
    }
}
