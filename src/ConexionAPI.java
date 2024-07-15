import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;

public class ConexionAPI {
    public void conexion (String moneda, String monedaCambio, double monto){
        String url = "https://v6.exchangerate-api.com/v6/76bb968c2150bb56818a0314/pair/"+moneda+"/"+monedaCambio+"/"+monto;
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(url))
                .build();
    }
}
