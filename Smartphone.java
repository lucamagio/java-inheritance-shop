public class Smartphone extends Prodotto{
    private int memoria;
    private String codiceImei;

    public Smartphone(String marca, String nome, int memoria){
        setCodice();
        setMemoria(memoria);
        setNome(nome);
        setMarca(marca);

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

    @Override
    public String toString() {
        return "Il codice dello Smartphone che vuoi acquistare è " + getCodice() 
                + ", Il suo Nome è " + getNome() 
                + ", la marca è " + getMarca() 
                + " ed ha una memoria di " + memoria + "gb";
    }
    
}
