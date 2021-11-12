import Clases.PalabraTraducida;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Locale;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {
        String opcion;
        String palabraEspanol;
        String palabraIngles;
        boolean salir=false;
        PalabraTraducida palabras = new PalabraTraducida();
        JOptionPane.showMessageDialog(null,"Bienvenido");
        do {
            try{
            opcion=JOptionPane.showInputDialog("Ingrese la opcion que necesite:\n"+
                                        "1. Agregar una palabra.\n"+
                                        "2. Consultar todo el diccionario.\n"+
                                        "3. Traducir una palabra de español a ingles\n"+
                                        "0. Salir ");
            switch (opcion){
                case "1":
                    palabraEspanol=JOptionPane.showInputDialog("Ingrese la palabra en español.");
                    if (validarPalabras(palabraEspanol)){
                        break;
                    }
                    palabraIngles=JOptionPane.showInputDialog("Ingrese la traduccion de "+palabraEspanol+" al ingles.");
                    if (validarPalabras(palabraIngles)){
                        break;
                    }
                    if(palabras.agregarPalabra(palabraEspanol.toLowerCase(),palabraIngles.toLowerCase())){
                        JOptionPane.showMessageDialog(null,"Se ingreso la palabra correctamente");
                    }else{
                        JOptionPane.showMessageDialog(null,"Ocurrio un error al ingresar la palabra");
                    }
                    continue;
                case "2":
                    palabras.MostrarDiccionario();
                    continue;
                case "3":
                    continue;
                case "0":
                    salir=true;
                    continue;
                default:
                    JOptionPane.showMessageDialog(null,"Ingerese un valor valido");

            }
            }catch (Exception e){
                JOptionPane.showMessageDialog(null,"Solo es posible salir inglesando 0");
            }
        }while (!salir);
    }
    public static boolean validarPalabras(String palabra){
        if (palabra.isEmpty()){
            Pattern p = Pattern.compile("[a-zA-Z]+");
            p.matcher(palabra).matches();
            JOptionPane.showMessageDialog(null,"Ingrese un valor valido (no se permiten numeros)");
            return true;
        }else{
            Pattern p = Pattern.compile("[a-zA-Z]+");
            if (!p.matcher(palabra).matches()){
                JOptionPane.showMessageDialog(null,"Ingrese un valor valido (no se permiten numeros)");
                return true;
            }
        }
        return false;
    }
}
