package opdracht2;

//In deze klasse zijn alle kenmerken die een product nodig heeft aangemaakt
public class Product extends Winkelwagen {
    private String naam;
    private double prijs;
    private double TotaleKorting;
    private double TotalePrijs;

    public Product() {
    }

    public String getNaam() {
        return naam;
    }

    public void setNaam(String naam) {
        this.naam = naam;
    }

    public double getPrijs() {
        return prijs;
    }

    public void setPrijs(double prijs) {
        this.prijs = prijs;
    }

    public void setKorting(double kortingsPercentage, int aantal, String dag) {

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
