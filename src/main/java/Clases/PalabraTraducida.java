package Clases;

import java.util.ArrayList;

public class PalabraTraducida {
    private String palabraEspanol;
    private String palarbaIngles;
    private ArrayList<PalabraTraducida> listaDePalabras;

    public PalabraTraducida(String palabraEspanol, String palarbaIngles) {
        this.palabraEspanol = palabraEspanol;
        this.palarbaIngles = palarbaIngles;
    }
    public PalabraTraducida() {

    }


    public String getPalabraEspanol() {
        return palabraEspanol;
    }

    public String getPalarbaIngles() {
        return palarbaIngles;
    }

    public ArrayList<PalabraTraducida> getListaDePalabras() {
        return listaDePalabras;
    }

    public void setListaDePalabras(ArrayList<PalabraTraducida> listaDePalabras) {
        this.listaDePalabras = listaDePalabras;
    }

    public void agregarPalabra(String palabraEspanol, String palarbaIngles){
        listaDePalabras.add(new PalabraTraducida(palabraEspanol,palarbaIngles));
    }
}
