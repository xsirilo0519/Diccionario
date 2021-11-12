package Presistencia;

import Clases.PalabraTraducida;
import jdk.swing.interop.SwingInterOpUtils;

import java.io.*;
import java.util.ArrayList;

public class Texto {

    private String rutas="src\\main\\resources\\Diccionario.txt";
    private File ruta =new File(rutas);
    private FileWriter fichero;
    private BufferedWriter bw;
    private ArrayList<PalabraTraducida> palabras;
    private String divisor[];

    public Texto() {
        palabras = new ArrayList<PalabraTraducida>();
        try {
            ruta.createNewFile();
        }catch (Exception e){}

    }

    public void leer(String nombreArchivo){

        try {

            FileReader r = new FileReader(nombreArchivo);
            BufferedReader buffer = new BufferedReader(r);

            String temp="";

            while (temp!=null){
                temp= buffer.readLine();
                if (temp==null)
                    break;
                divisor=temp.split(" - ");
                System.out.println();
                palabras.add(new PalabraTraducida(divisor[0],divisor[1]));
            }
        }catch (Exception e){
            System.out.println(e);
        }
    }

    public void escribir(String palabraEspanol,String palabraIngles){
        try
        {
            fichero = new FileWriter(ruta, true);
            bw = new BufferedWriter(fichero);
            bw.newLine();
            bw.write(palabraEspanol+"-"+palabraIngles);
            bw.close();
            fichero.close();
        } catch (Exception e) {
            System.out.println("Error al escribri el texto");

        }
    }


}
