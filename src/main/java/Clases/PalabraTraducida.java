package Clases;

import Presistencia.Texto;

import java.util.ArrayList;

public class PalabraTraducida {
    private String palabraEspanol;
    private String palabraIngles;
    private ArrayList<PalabraTraducida> listaDePalabras;
    private Texto t;

    public PalabraTraducida(String palabraEspanol, String palabraIngles) {
        this.palabraEspanol = palabraEspanol;
        this.palabraIngles = palabraIngles;
    }
    public PalabraTraducida() {
        listaDePalabras= new ArrayList<PalabraTraducida>();
        t = new Texto();
    }


    public String getPalabraEspanol() {
        return palabraEspanol;
    }

    public String getPalabraIngles() {
        return palabraIngles;
    }

    public boolean agregarPalabra(String palabraEspanol, String palabraIngles){
         return t.escribir(palabraEspanol,palabraIngles);
    }

    public void MostrarDiccionario(){
        this.listaDePalabras=t.leer();
        if (this.listaDePalabras!=null) {
            listaDePalabras.forEach(x -> System.out.println(x.getPalabraEspanol() + " = " + x.getPalabraIngles()));
        }
    }
}
