package Presistencia;

import java.io.BufferedReader;
import java.io.FileReader;

public class Texto {

    public Texto(){

        leer("src\\main\\resources\\hola.txt");
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
                System.out.println(temp);


            }


        }catch (Exception e){
            System.out.println(e);
        }
    }


}
