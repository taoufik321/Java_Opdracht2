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
            System.out.println("Dit betekent dat je wisselgeld had van in totaal: €" + String.format( "%.2f", wisselgeld));
        } else {
            System.out.println("Je hebt geen wisselgeld ontvangen.");
        }
    }

    public void totaleKorting() {
        double totaleKorting = 0;

        for (Product p : products){
            totaleKorting += p.getTotaleKorting();
        }

        totalePrijs = totalePrijs - totaleKorting;

        if (totaleKorting > 0) {
            System.out.println("Dit is de totale Korting nu: €" + String.format( "%.2f", totaleKorting) + ", dus moest er in totaal: €" + (totalePrijs) + " betaald worden." + "\n");
        } else {
            System.out.println("Er is geen korting toegekend aan 1 van je producten.");
        }
    }

    public void print(){
        System.out.println("Dit is de winkelwagen nu:");
        for (Product p : products){
            System.out.println("Product: " + p.getNaam() + " met een prijs van: €" + String.format( "%.2f", p.getPrijs()) + " per stuk en een aantal van: " + p.getAantal() + " stuks.");
        }

        for (Product p : products) {
            totalePrijs += p.getPrijs() * p.getAantal();
        }

        System.out.println("\n" + "De totaalprijs van alle producten in je winkelwagen (voor de korting) is nu: €" + String.format( "%.2f", totalePrijs));
    }

    public static void main(String[] args) {
        int geld = 44;

        Product product1 = new Product("Robijn", 3, 2);
        product1.setKorting(31, 2, "");

        Product product2 = new Product("Brinta", 2.50, 1);

        Product product3 = new Product("Chinese Groenten", 5, 1);

        Product product4 = new Product("Kwark", 2, 1);
        product4.setKorting(50,1, "woensdag");

        Product product5 = new Product("Luiers", 10, 4);
        product5.setKorting(25, 4, "");

        Product product6 = new Product("Chocoladekoeken", 1.75, 1);

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

        winkelwagen.totaleKorting();

        winkelwagen.afrekenen(geld);

        winkelwagen.wisselgeld(geld);
    }
}
