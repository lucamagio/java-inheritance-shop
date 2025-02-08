public class Televisori extends Prodotto{
    private int pollici;
    private boolean smartTv;

    public Televisori(String marca, String nome, int pollici, boolean smartTV){
        setCodice();
        setMarca(marca);
        setNome(nome);
        setPollici(pollici);
        setSmartTv(smartTV);
    }

    public int setPollici(int pollici){
        return this.pollici = pollici;
    }

    public boolean setSmartTv(boolean smartTv){
        return this.smartTv = smartTv;
    }

    public void getPollici(){
        System.out.println(pollici);
    }

    public void getSmartTv(){
        System.out.println(smartTv);
        
    }

    @Override
    public String toString() {
        return "Il codice del Televisore che vuoi acquistare è " + getCodice() 
                + ", Il suo Nome è " + getNome() 
                + ", la marca è " + getMarca()
                + ", ha una grandezza di " + pollici +" pollici"
                + ", è una SmartTV: " + smartTv;
    }
    
}
