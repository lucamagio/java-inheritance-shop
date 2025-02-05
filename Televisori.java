public class Televisori extends Prodotto{
    private int pollici;
    private boolean smartTv;

    public Televisori(){
        setCodice();
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

    public void specificheTelevisore(){
        System.out.println("La grandezza dello schermo del televisore è: " + pollici + " pollici");
        System.out.println("Il televisore è smart: " + smartTv);
    }
    
}
