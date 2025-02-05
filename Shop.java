public class Shop {
    public static void main(String[] args) {
        Prodotto prodotto = new Prodotto();
        Smartphone smartphone = new Smartphone();
        Televisori televisore = new Televisori();
        Cuffie cuffie = new Cuffie();

        prodotto.setPrezzo(12.3);
        prodotto.setIva(1.22);

        smartphone.setMarca("Samsung");
        smartphone.setCodiceImei("123abC456XYz");
        smartphone.setMemoria(512);

        televisore.setMarca("LG");
        televisore.setPollici(52);
        televisore.setSmartTv(true);

        cuffie.setMarca("Amazon");
        cuffie.setColore("Rosso");
        cuffie.setWireless(true); //Ha un risultato a seconda se è true o false

        prodotto.dettagliProdotto();

        smartphone.dettagliProdotto();
        smartphone.specificheSmartphone();

        televisore.dettagliProdotto();
        televisore.specificheTelevisore();
        
        cuffie.dettagliProdotto();
        cuffie.specificheCuffie();

    }
    
}
