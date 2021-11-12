package ClasesObj;

import Presistencia.Texto;
import javax.swing.*;
import java.util.ArrayList;

public class PalabraTraducida {
    private String palabraEspanol;
    private String palabraIngles;
    private ArrayList<PalabraTraducida> listaDePalabras;
    private Texto t;
    private PalabraTraducida p=null;

    public PalabraTraducida(String palabraEspanol, String palabraIngles) {
        this.palabraEspanol = palabraEspanol;
        this.palabraIngles = palabraIngles;
    }
    public PalabraTraducida() {
        listaDePalabras= new ArrayList<>();
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

    public void buscar(String pToTraducir){
        this.listaDePalabras=t.leer();
        p=null;
        this.listaDePalabras.stream().filter(x->x.getPalabraEspanol().equals(pToTraducir)).limit(1).forEach(s-> p=new PalabraTraducida(s.getPalabraEspanol(),s.getPalabraIngles()));
        if (p!=null){
            JOptionPane.showMessageDialog(null,"La traducción de: "+p.getPalabraEspanol()+" es: \n"+p.getPalabraIngles());
        }else {
            JOptionPane.showMessageDialog(null,"No se encontró la traduccion");
        }
    }

    public void mostrarDiccionario(){
        this.listaDePalabras=t.leer();
        if (this.listaDePalabras!=null) {
            listaDePalabras.forEach(x -> System.out.println(x.getPalabraEspanol() + " = " + x.getPalabraIngles()));
        }
    }
}
