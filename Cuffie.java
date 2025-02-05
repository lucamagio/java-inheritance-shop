public class Cuffie extends Prodotto{
    private String colore;
    private boolean wireless;

    public Cuffie(){
        getCodice();
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
}
