import com.google.gson.Gson;

public class CriaJSON {
    public Moeda respostaParaJson(String resposta) {

        // Converte através da bliclioteca GSON a resposta em formato String para JSON
        Moeda json = new Gson().fromJson(resposta, Moeda.class);

        // Retorna a resposta JSON
        return json;
    }
}
