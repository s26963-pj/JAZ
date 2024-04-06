package pl.pjatk.zjazd2.model;


public class Car {
    private static int id;
    private String marka;
    private String model;
    private Double cena;

    public Car(String marka, String model, Double cena) {
        id = id + 1;
        this.marka = marka;
        this.model = model;
        this.cena = cena;
    }

    public static int getId() {
        return id;
    }

    public String getMarka() {
        return marka;
    }

    public String getModel() {
        return model;
    }

    public Double getCena() {
        return cena;
    }

    public static void setId(int id) {
        Car.id = id;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setCena(Double cena) {
        this.cena = cena;
    }
}
