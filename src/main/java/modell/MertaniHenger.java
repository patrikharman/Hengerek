package modell;

public class MertaniHenger {
    private int hengerDarab;
    private double sugar;
    private double magassag;



    public MertaniHenger(double sugar, double magassag) {
        this.sugar = sugar;
        this.magassag = magassag;
    }
    public double getSugar() {
        return sugar;
    }

    public double getMagassag() {
        return magassag;
    }
    public int getHengerDarab() {
        return hengerDarab;
    }
    public void setSugar(double sugar) {
        this.sugar = sugar;
    }

    public void setMagassag(double magassag) {
        this.magassag = magassag;
    }
    public double terfogat(){
        return 0.0;
    }
    @Override
    public String toString() {
        return "MertaniHenger{" +
                "hengerDarab=" + hengerDarab +
                ", sugar=" + sugar +
                ", magassag=" + magassag +
                '}';
    }
}
