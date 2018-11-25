package opdracht2;

import java.util.ArrayList;

//Hier zitten alle methodes waar een winkelwagen aan moet voldoen, in de winkelwagen moet een product toegevoegd kunnen worden.
public class Winkelwagen {
    ArrayList<Product> products = new ArrayList<Product>();
    double totalePrijs;

    public void toevoegen(Product p) {
        products.add(p);
    }

    public void verwijderen(Product p) {
        products.remove(p);
    }

    public void afrekenen(int geld) {
        for (Product p : products) {
            totalePrijs += p.getPrijs();
        }

        if(geld < totalePrijs) {
            System.out.println("Je hebt niet genoeg geld om de producten te kunnen betalen.");
        } else {
            System.out.println("Je producten zijn betaald aan de kassa.");
        }
    }

    public void wisselgeld(int geld) {
        double wisselgeld = geld - totalePrijs;

        System.out.println("Je hebt betaald met: €" + geld + " en de producten in je winkelwagen hadden een totale kosten van: €" + totalePrijs);

        if(wisselgeld >= 0) {
            System.out.println("Dit betekent dat je wisselgeld had van in totaal: €" + wisselgeld);
        } else {
            System.out.println("Je hebt geen wisselgeld ontvangen.");
        }

    }

    public void totaleKorting() {

    }

    public void print(){
        System.out.println("Dit is de winkelwagen nu:");
        for (Product p : products){
            System.out.println("Product: " + p.getNaam() + " met een prijs van: €" + String.format( "%.2f", p.getPrijs()));
        }
    }

    public static void main(String[] args) {
        int geld = 20;

        Product product1 = new Product();
        product1.setNaam("Robijn");
        product1.setPrijs(3);
        product1.setKorting(31, 2, "");

        Product product2 = new Product();
        product2.setNaam("Brinta");
        product2.setPrijs(2.50);

        Product product3 = new Product();
        product3.setNaam("Chinese Groenten");
        product3.setPrijs(5);

        Product product4 = new Product();
        product4.setNaam("Kwark");
        product4.setPrijs(2);
        product4.setKorting(50,1, "woensdag");

        Product product5 = new Product();
        product5.setNaam("Luiers");
        product5.setPrijs(10);
        product5.setKorting(25, 4, "");

        Product product6 = new Product();
        product6.setNaam("Chocoladekoeken");
        product6.setPrijs(1.75);

        Winkelwagen winkelwagen = new Winkelwagen();
        winkelwagen.toevoegen(product1);
        winkelwagen.toevoegen(product2);
        winkelwagen.toevoegen(product3);
        winkelwagen.toevoegen(product4);
        winkelwagen.toevoegen(product5);
        winkelwagen.toevoegen(product6);

        //winkelwagen.verwijderen(product3);
        //winkelwagen.verwijderen(product6);

        winkelwagen.print();

        System.out.println("");

        winkelwagen.afrekenen(geld);

        winkelwagen.wisselgeld(geld);

//      winkelwagen.totaleKorting();
    }
}
