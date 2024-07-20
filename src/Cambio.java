import com.google.gson.annotations.SerializedName;

public class Cambio {
    @SerializedName("base_code") private String monedaBase;
    @SerializedName("target_code") private String monedaCambio;
    private double monto;
    @SerializedName("conversation_result") private double resultado;

    public String getMonedaBase() {
        return monedaBase;
    }

    public String getMonedaCambio() {
        return monedaCambio;
    }

    public double getMonto() {
        return monto;
    }

    public double getResultado() {
        return resultado;
    }
}
