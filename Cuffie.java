public class Cuffie extends Prodotto{
    private String colore;
    private boolean wireless;

    public Cuffie(String marca, String nome, String colore, boolean wireless){
        getCodice();
        setMarca(marca);
        setNome(nome);
        setColore(colore);
        setWireless(wireless);

    }

    public String setColore(String colore){
        return this.colore = colore;
    }

    public boolean  setWireless(boolean wireless){
        return this.wireless = wireless;
    }

    public void getColore(){
        System.out.println(colore);
    }

    public void getWireless(){
        System.out.println(wireless);
    }

    public void specificheCuffie(){
        System.out.println("Il colore delle cuffie è: " + colore);
        
        if(wireless == true){
            System.out.println("Le cuffie sono Wireless");
        }else{
            System.out.println("Le cuffie sono Cablate");
        }
    }

    @Override
    public String toString() {
        return "Il codice delle Cuffie che vuoi acquistare è " + getCodice() 
                + ", Il suo Nome è " + getNome() 
                + ", la marca è " + getMarca()
                + ", il loro colore è " + colore
                + ", le cuffie sono wireless: " +  wireless;
    }
}
