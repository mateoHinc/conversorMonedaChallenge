package Archivo;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import modelos.TasaCambio;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class GenerarJSON {

    private List<TasaCambio> consultas;

    public GenerarJSON() {
        this.consultas = new ArrayList<>();
    }

    public void agregarTasa(TasaCambio tasaCambio) {
        this.consultas.add(tasaCambio);
    }

    public void crearArchivoJSON() throws IOException {
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        FileWriter archivo = new FileWriter("generadorDeTasas.json");
        archivo.write(gson.toJson(this.consultas));
        archivo.close();
    }
}
