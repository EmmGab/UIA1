package uia.com.inventarios;

import java.io.IOException;
import java.util.*;

public class GestorAjusteNivelInventario extends ReporteAjusteNivelInventario {
    List<SolicitudAjusteNivelInventario> items = new ArrayList<SolicitudAjusteNivelInventario>();

    public GestorAjusteNivelInventario(IAjusteNivelInventario inventario) {
        super(inventario);
    }

    public GestorAjusteNivelInventario(String nombre) {
    }

    public GestorAjusteNivelInventario() {
    }

    public List<SolicitudAjusteNivelInventario> getItems() {
        return this.items;
    }


    public void setItems(List<SolicitudAjusteNivelInventario> items) {
        this.items = items;
    }


    public SolicitudAjusteNivelInventario agregaSolicitudSalidaMaterial(String nomArchivo, String solicitante, String categoria) throws IOException {
        String id = nomArchivo + "_"+ String.valueOf(this.getItems().size()+1)+".json";
        String existencia = "";
        IAjusteNivelInventario inventario = null;
        SolicitudAjusteNivelInventario newSSM = new SolicitudAjusteNivelInventario(super.inventario, id, solicitante, categoria);
        return newSSM;
    }


    public void cargaSolicitudRetiroToInventario(NivelInventario inventario){

        Iterator<Map.Entry<String,InfoItem>> partida = (Iterator<Map.Entry<String, InfoItem>>) sem.getInventario();
        Iterator<Map.Entry<String,InfoItem>> subpartida = (Iterator<Map.Entry<String, InfoItem>>) sem.getInventario();
        Iterator<Map.Entry<String,InfoItem>> categoria = (Iterator<Map.Entry<String, InfoItem>>) sem.getInventario();

        while(partida.hasNext()){

        }
    }

    public void serializaNivelInventario(String s) {

    }

    //
    @Override
    public void print() {

    }
}
