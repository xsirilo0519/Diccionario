package Clases;

public class PalabraTraducida {
    private String palabraEspañol;
    private String palarbaIngles;

    public PalabraTraducida(String palabraEspañol, String palarbaIngles) {
        this.palabraEspañol = palabraEspañol;
        this.palarbaIngles = palarbaIngles;
    }

    public String getPalabraEspañol() {
        return palabraEspañol;
    }

    public String getPalarbaIngles() {
        return palarbaIngles;
    }
}
