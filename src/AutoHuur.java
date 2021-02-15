public class AutoHuur {
    int aantalDagen;
    public Klant huurder;
    public Auto gehuurdeAuto;

    public void Autohuur(){

    }

    public void setAantalDagen(int aantalDagen) {
        this.aantalDagen = aantalDagen;
    }

    public int getAantalDagen() {
        return aantalDagen;
    }

    public void setGehuurdeAuto(Auto gehuurdeAuto) {
        this.gehuurdeAuto = gehuurdeAuto;
    }

    public Auto getGehuurdeAuto() {
        return gehuurdeAuto;
    }

    public void setHuurder(Klant huurder) {
        this.huurder = huurder;
    }

    public Klant getHuurder() {
        return huurder;
    }

    public double totaalPrijs(){
        if (gehuurdeAuto == null){
            return 0.0;
        }
        if (huurder == null){
            return 0.0;
        }
        double totaal = aantalDagen * gehuurdeAuto.prijsPerDag;
        double korting = (100 - huurder.getKorting()) / 100;
        return totaal * korting;
    }

    public String toString() {
        String variable = "";
        if (gehuurdeAuto == null){
            variable += "er is geen auto bekend";
        }
        else {
            variable += gehuurdeAuto;
        }
        if (huurder == null){
            variable += "\ner is geen huurder bekend";
        }
        else {
            variable += huurder;
        }
        return variable + "\n" + "aantal dagen: " + aantalDagen + " en dat kost " + totaalPrijs();
    }
}
