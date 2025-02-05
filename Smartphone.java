public class Smartphone extends Prodotto{
    private int memoria;
    private String codiceImei;

    public Smartphone(){
        setCodice();
    }

    public String setCodiceImei(String codiceImei){
        return this.codiceImei = codiceImei;
    }

    public int setMemoria(int memoria){
        return this.memoria = memoria;
    }

    public void getCodiceImei(){
        System.out.println(codiceImei);
    }

    public void getMemoria(){
        System.out.println(memoria);
    }

    public void specificheSmartphone(){
        System.out.println("Il codice IMEI è: " + codiceImei);
        System.out.println("La memoria è di: " + memoria + " gb");
    }
    
}
