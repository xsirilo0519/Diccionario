import Clases.PalabraTraducida;

import javax.swing.*;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        String opcion;
        boolean salir=false;

        JOptionPane.showMessageDialog(null,"Bienvenido");
        do {

            opcion=JOptionPane.showInputDialog("Ingrese la opcion que necesite:\n"+
                                        "1. Agregar una palabra.\n"+
                                        "2. Consultar todo el diccionario.\n"+
                                        "3. Traducir una palabra de español a ingles\n"+
                                        "0. Salir ");
            switch (opcion){
                case "1":

                case "2":

                case "3":

                case "0":
                    salir=true;
            }
        }while (salir);
    }
}
