import java.util.Random;

public class Prodotto {
    private int codice;
    private String nome;
    private String marca;
    private double prezzo;
    private double iva;

    public Prodotto (){
       this.codice = setCodice();
    }
    
    protected int setCodice(){
       return new Random().nextInt(1000);
    }

    public String setNome(String nome){
         return this.nome = nome;
    }

    public String setMarca(String marca){
        return this.marca = marca;
    }

    public double setPrezzo(double prezzo){
        return this.prezzo = prezzo;
    }

    public double setIva(double iva){
        return this.iva = iva;
    }

    public int getCodice(){
        return codice;
    }

    public String getNome(){
        return nome;
    }

    public String getMarca(){
        return marca;
    }

    public double getPrezzo(){
        return prezzo;
    }

    public double getIva(){
        return iva;
    }

    public void dettagliProdotto(){
        System.out.println("Il codice è: " + codice);
        System.out.println("Il nome è: " + nome);
        System.out.println("La marca è: " + marca);
        System.out.println("Il prezzo è: " + prezzo + " euro");
        System.out.println("L'iva è: " + iva);
    }
}
