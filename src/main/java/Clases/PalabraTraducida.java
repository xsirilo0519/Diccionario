package Clases;

import java.util.ArrayList;

public class PalabraTraducida {
    private String palabraEspañol;
    private String palarbaIngles;
    private ArrayList<PalabraTraducida> listaDePalabras;

    public PalabraTraducida(String palabraEspañol, String palarbaIngles) {
        this.palabraEspañol = palabraEspañol;
        this.palarbaIngles = palarbaIngles;
    }
    public PalabraTraducida() {

    }


    public String getPalabraEspañol() {
        return palabraEspañol;
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

    public void agregarPalabra(String palabraEspañol, String palarbaIngles){
        listaDePalabras.add(new PalabraTraducida(palabraEspañol,palarbaIngles));
    }
}
