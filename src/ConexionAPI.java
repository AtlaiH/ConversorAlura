import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonElement;
import com.google.gson.JsonParser;

import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.time.Duration;

public class ConexionAPI {
    public void conexion (String moneda, String monedaCambio, double monto) {
        try{
            HttpClient client = HttpClient.newBuilder().version(HttpClient.Version.HTTP_2)
                    .connectTimeout(Duration.ofSeconds(10)).build();

            HttpRequest request = HttpRequest.newBuilder().uri(URI.create("https://v6.exchangerate-api.com/v6/76bb968c2150bb56818a0314/pair/" +
                    moneda+"/"+monedaCambio+"/"+monto)).timeout(Duration.ofMinutes(1)).header("Content-Type", "application/json")
                    .GET().build();

            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
            String respuesta = response.body();
            Gson gson = new GsonBuilder().setPrettyPrinting().create();
            JsonElement jsonElement = JsonParser.parseString(respuesta);
            String nuevo = gson.toJson(jsonElement);
            System.out.println(nuevo);

        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
