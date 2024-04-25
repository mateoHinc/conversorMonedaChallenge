package apis;

import com.google.gson.Gson;
import modelos.TasaCambio;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ConsultarMoneda {

    public double obtenerTasaCambio(String monedaOrigen, String monedaDestino){
        URI direccion = URI.create("https://v6.exchangerate-api.com/v6/a3e12e7221c90ba695805dcf/latest/"+monedaOrigen);

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(direccion)
                .build();

        try {

            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

            if(response.statusCode() == 200) {
                TasaCambio tasaCambio = new Gson().fromJson(response.body(), TasaCambio.class);
                double tasa = tasaCambio.conversion_rates().get(monedaDestino);
                return tasa;
            }else {
                throw new RuntimeException("Error al obtener la tasa de cambio");
            }
        } catch (Exception e) {
            throw new RuntimeException("No se pudo obtener la tasa de cambio");
        }

    }

    public double convertir(double valor, double tasaCambio) {
        return valor * tasaCambio;
    }

    public TasaCambio buscarTasa(String monedaOrigen) {
        URI direccion = URI.create("https://v6.exchangerate-api.com/v6/a3e12e7221c90ba695805dcf/latest/"+monedaOrigen);

        HttpClient client = HttpClient.newHttpClient();

        HttpRequest request = HttpRequest.newBuilder()
                .uri(direccion)
                .build();

        try {
            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
            return new Gson().fromJson(response.body(), TasaCambio.class);
        } catch (Exception e) {
            throw new RuntimeException("Moneda no encotrada");
        }
    }
}
