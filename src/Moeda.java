import java.util.Map;

// Record definindo a estrutura dos dados que serão recebidos pela API de cotação
public record Moeda(Map<String, String> conversion_rates) {
}
