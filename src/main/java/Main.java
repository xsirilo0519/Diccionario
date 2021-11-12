import ClasesObj.PalabraTraducida;

import javax.swing.*;
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
                    break;
                case "2":
                    palabras.mostrarDiccionario();
                    break;
                case "3":
                    palabraEspanol=JOptionPane.showInputDialog("Ingrese la palabra a traducir");
                    if (validarPalabras(palabraEspanol)){
                        break;
                    }
                    palabras.buscar(palabraEspanol.toLowerCase());
                    break;
                case "0":
                    salir=true;
                    break;
                default:
                    JOptionPane.showMessageDialog(null,"Ingerese un valor valido");
                    break;
            }
            }catch (Exception e){
                JOptionPane.showMessageDialog(null,"Solo es posible salir inglesando 0");
            }
        }while (!salir);
    }
    public static boolean validarPalabras(String palabra){
        Pattern p = Pattern.compile("[a-zA-Z]+");
        if (palabra.isEmpty()){
                JOptionPane.showMessageDialog(null,"Ingrese un valor valido (no se permiten numeros)");
        }else{
            if (!p.matcher(palabra).matches()){
                JOptionPane.showMessageDialog(null,"Ingrese un valor valido (no se permiten numeros)");
                return true;
            }
        }
        return false;
    }
}
