import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.URI;
import java.util.Scanner;
import com.google.gson.Gson;
import com.google.gson.JsonObject;

public class ConversorDeMoedas {

    // Substitua pela sua chave da API
    private static final String API_KEY = "c6127d27b03f51285a8f0b06"; // Insira sua chave da API aqui
    private static final String BASE_URL = "https://v6.exchangerate-api.com/v6/";

    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        String[] moedas = {"USD", "EUR", "BRL", "JPY", "GBP", "CAD"};

        // Menu de seleção de moedas
        System.out.println("Conversor de Moedas");
        System.out.println("Escolha a moeda base:");
        for (int i = 0; i < moedas.length; i++) {
            System.out.println((i + 1) + ". " + moedas[i]);
        }
        int opcaoBase = scanner.nextInt();

        System.out.println("Escolha a moeda de conversão:");
        for (int i = 0; i < moedas.length; i++) {
            if (i != opcaoBase - 1) {  // Evitar a mesma moeda
                System.out.println((i + 1) + ". " + moedas[i]);
            }
        }
        int opcaoConversao = scanner.nextInt();

        System.out.println("Digite o valor a ser convertido:");
        double valor = scanner.nextDouble();

        // Moedas selecionadas
        String moedaBase = moedas[opcaoBase - 1];
        String moedaConversao = moedas[opcaoConversao - 1];

        // Chamada para a API com a moeda base
        String apiUrl = BASE_URL + API_KEY + "/latest/" + moedaBase;
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(apiUrl))
                .build();

        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

        // Usando Gson para processar o JSON retornado pela API
        Gson gson = new Gson();
        JsonObject jsonObject = gson.fromJson(response.body(), JsonObject.class);
        JsonObject rates = jsonObject.getAsJsonObject("conversion_rates");

        // Obtendo a taxa de conversão
        double taxaConversao = rates.get(moedaConversao).getAsDouble();

        // Realizando o cálculo da conversão
        double valorConvertido = valor * taxaConversao;
        System.out.printf("Valor convertido: %.2f %s%n", valorConvertido, moedaConversao);

        scanner.close();
    }
}
