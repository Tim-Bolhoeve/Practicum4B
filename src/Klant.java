public class Klant {
    String naam;
    double kortingsPercentage;

    public Klant(String nm){
        this.naam = nm;
    }

    public void setKorting(double kortingsPercentage) {
        this.kortingsPercentage = kortingsPercentage;
    }

    public double getKorting() {
        return kortingsPercentage;
    }

    public String toString() {
        return "\nop naam van: " + naam + " (" + "korting: " + kortingsPercentage + "%)";
    }
}
