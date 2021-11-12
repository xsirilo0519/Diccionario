package Presistencia;

import ClasesObj.PalabraTraducida;

import java.io.*;
import java.util.ArrayList;

public class Texto {

    private File ruta =new File("src\\main\\resources\\Diccionario.txt");
    private FileWriter fichero;
    private BufferedWriter bw;
    private FileReader r;
    private BufferedReader buffer;
    private ArrayList<PalabraTraducida> palabras;
    private String divisor[];
    private String temp;

    public Texto() {
        palabras = new ArrayList<PalabraTraducida>();
        try {
            ruta.createNewFile();
        }catch (Exception e){}

    }

    public ArrayList<PalabraTraducida> leer(){
        try {
            r = new FileReader(ruta);
            buffer = new BufferedReader(r);
            temp="";
            while (temp!=null){
                temp= buffer.readLine();
                if (temp==null)
                    break;
                divisor=temp.split("-");
                palabras.add(new PalabraTraducida(divisor[0],divisor[1]));
            }
            buffer.close();
            r.close();
            return palabras;
        }catch (Exception e){
            return null;
        }
    }

    public boolean escribir(String palabraEspanol,String palabraIngles){
        try
        {
            fichero = new FileWriter(ruta, true);
            bw = new BufferedWriter(fichero);
            bw.write(palabraEspanol+"-"+palabraIngles);
            bw.newLine();
            bw.close();
            fichero.close();
            return true;
        } catch (Exception e) {
            System.out.println("Error al escribri el texto");
            return false;
        }
    }


}
