package MasterMind;

public class Tablero {
    private String cifraAleatorio;
    private String cifraSecuencia;
    private String cifraPista;



    public static Tablero instanciar=null;
    public static Tablero getInstance() {
        if(instanciar==null){
            instanciar = new Tablero();
        }
        return instanciar;
    }

    public static void setcifraAleatorio() {
    }

    public void setCifraSecuencia(String cifraSecuencia) {
        this.cifraSecuencia = cifraSecuencia;
    }

    public void setCifraPista(String cifraPista) {
        this.cifraPista = cifraPista;
    }

    public String getCifraAleatorio() {
        return cifraAleatorio;
    }

    public String getCifraSecuencia() {
        return cifraSecuencia;
    }

    public String getCifraPista() {
        return cifraPista;
    }
}
