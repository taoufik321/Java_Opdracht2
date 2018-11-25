package opdracht2;

//In deze klasse zijn alle kenmerken die een product nodig heeft aangemaakt
public class Product extends Winkelwagen {
    private String naam;
    private double prijs;
    private int aantal;
    private double korting;
    private String dag = "woensdag";

    public Product(String naam, double prijs, int aantal) {
        this.naam = naam;
        this.prijs = prijs;
        this.aantal = aantal;
    }

    public String getNaam() {
        return naam;
    }

    public int getAantal() {
        return aantal;
    }

    public double getPrijs() {
        return prijs;
    }

    public void setKorting(double kortingsPercentage, int aantal, String dag) {
        if (this.aantal >= aantal && (dag.equals("") || this.dag.equals(dag))) {
            korting = prijs * (kortingsPercentage / 100) * aantal;
        }
    }

    public double getTotaleKorting(){
        return korting;
    }

    public void setNaam() {
        this.naam = naam;
    }

    public void setAantal() {
        this.aantal = aantal;
    }

    public void getKorting(){
        this.korting = korting;
    }

    public void setPrijs() {
        this.prijs = prijs;
    }

/*    //Dit kan gebruikt worden om een Product object in te kunnen zien
    @Override
    public String toString() {
        return "Product{" +
                "naam='" + naam + '\'' +
                ", prijs=" + prijs +
                '}';
    }*/
}
