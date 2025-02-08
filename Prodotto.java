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

    @Override
    public String toString() {
        return "Il codice del Prodotto che vuoi acquistare è " + codice 
                + ", Il suo Nome è " + nome 
                + " e la marca è " + marca;
    }

    
}
