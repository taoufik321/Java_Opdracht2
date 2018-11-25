package opdracht2;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Dit is het geldbedrag dat de klant bij zich heeft.
        int geld = 45;

        // Hier worden de producten aangemaakt.
        Product product1 = new Product("Robijn", 3, 2);
        // Sommige producten hebben ook aanbiedingen wanneer er meerdere van gehaald worden.
        product1.setKorting(31, 2, "");

        Product product2 = new Product("Brinta", 2.50, 1);

        Product product3 = new Product("Chinese Groenten", 5, 1);

        Product product4 = new Product("Kwark", 2, 1);
        // Je hebt ook producten die op een speciefieke dag een aanbieding hebben.
        product4.setKorting(50,1, "woensdag");

        Product product5 = new Product("Luiers", 10, 4);
        product5.setKorting(25, 4, "");

        Product product6 = new Product("Chocoladekoeken", 1.75, 1);

        // Wanneer de producten aangemaakt zijn die je dit in de winkelwagen neer te zetten.
        Winkelwagen winkelwagen = new Winkelwagen();
        winkelwagen.toevoegen(product1);
        winkelwagen.toevoegen(product2);
        winkelwagen.toevoegen(product3);
        winkelwagen.toevoegen(product4);
        winkelwagen.toevoegen(product5);
        winkelwagen.toevoegen(product6);

        // Je kunt ook de producten eventueel verwijderen uit je lijst als je geld tekort komt.
        //winkelwagen.verwijderen(product3);
        //winkelwagen.verwijderen(product6);

        // Hiermee worden alle items in je winkelwagen weergeven in de output.
        winkelwagen.print();

        // Dit is aangemaakt om de totale korting te kunnen laten zien van alle producten die in de aanbieding zijn.
        winkelwagen.totaleKorting();

        // Hiermee is het mogelijk om te kunnen afrekenen, hierbij wordt er gekeken naar hoeveel geld de klant heeft en wat de prijs van de producten in je lijst is min de eventuele kortingen ervan.
        winkelwagen.afrekenen(geld);

        // Indien je nog geld over hebt na het doen van je boodschappen zal dit ook in de output getoond worden.
        winkelwagen.wisselgeld(geld);
    }
}
