package modelos;

import com.google.gson.annotations.SerializedName;

import java.util.Map;

public class TasaCambio {
    private String result;
    private String documentation;
    private String terms_of_use;
    private long time_last_update_unix;
    private String time_last_update_utc;
    private long time_next_update_unix;
    private String time_next_update_utc;
    private String base_code;

    @SerializedName("conversion_rates")
    private Map<String, Double> conversion_rates;

    public TasaCambio() {
    }

    public Map<String, Double> conversion_rates() {
        return this.conversion_rates;
    }
}
