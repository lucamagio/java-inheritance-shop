import java.util.Scanner;

public class Carrello {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Quanti prodotti vuoi acquistare? ");
        int numProdotti = scan.nextInt();
        scan.nextLine();

        Object[] carrello = new Object[numProdotti];

        for (int i = 0; i < numProdotti; i++){
        System.out.println("Scegli cosa vuoi acquistare");
        System.out.println("Digita 1 per Smartphone, 2 per Televisore, 3 per Cuffie: ");
        int scelta = scan.nextInt();
        scan.nextLine();

        switch (scelta) {
            case 1:
                {
                    System.out.println("Quale marca di Smartphone vuoi: ");
                    String marca = scan.next();

                    scan.nextLine();

                    System.out.println("Qual è il nome dello Smartphone che vuoi: ");
                    String nome = scan.nextLine();

                    System.out.println("Quanta memoria deve avere: ");
                    int memoria = scan.nextInt();

                    carrello[i] = new Smartphone(marca, nome, memoria);
                    break;
                }
            case 2:
                {
                    System.out.println("Quale marca di Televisore vuoi: ");
                    String marca = scan.next();

                    scan.nextLine();

                    System.out.println("Qual è il nome del Televisore che vuoi: ");
                    String nome = scan.nextLine();

                    System.out.println("Di quanti pollici deve essere: ");
                    int pollici = scan.nextInt();

                    System.out.println("Dev'essere una smartTV: ");
                    boolean smart = scan.nextBoolean();

                    carrello[i] = new Televisori(marca, nome, pollici, smart);
                    break;
                }
            case 3:
                {
                    System.out.println("Quale marca di Cuffie vuoi: ");
                    String marca = scan.next();

                    scan.nextLine();

                    System.out.println("Qual è il nome delle Cuffie che vuoi: ");
                    String nome = scan.nextLine();

                    System.out.println("Di che colore devono essere: ");
                    String colore = scan.next();

                    System.out.println("Devono essere wireless: ");
                    boolean wireless = scan.nextBoolean();

                    carrello[i] = new Cuffie(marca, nome, colore, wireless);
                    break;
                }
            default:
                System.out.println("Hai inserito un valore non valido, ritenta");
                i--;
            }
        }

        System.out.println("Ecco i prodotti che vuoi acquistare:");
        for (Object prodotto : carrello) {
            System.out.println(prodotto.toString());
        }

        scan.close();
    }
}
