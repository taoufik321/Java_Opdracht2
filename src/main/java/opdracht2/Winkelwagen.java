package opdracht2;

import java.util.ArrayList;

//Hier zitten alle methodes waar een winkelwagen aan moet voldoen, in de winkelwagen moet een product toegevoegd kunnen worden.
public class Winkelwagen {
    // Dit is de lijst voor alle producten.
    ArrayList<Product> products = new ArrayList<Product>();

    // Met deze variabele wordt de totale prijs opgeslagen van alle producten in de lijst.
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
}
