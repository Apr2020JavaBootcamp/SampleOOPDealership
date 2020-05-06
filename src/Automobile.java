public class Automobile {
    private String maker;
    private String model;
    private int year;
    private double price;
    private int qty;

    public Automobile() {
    }

    public Automobile(String maker, String model, int year, double price, int qty) {
        this.maker = maker;
        this.model = model;
        this.year = year;
        this.price = price;
        this.qty = qty;
    }

    public String getMaker() {
        return maker;
    }

    public void setMaker(String maker) {
        this.maker = maker;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public String toString() {
        String retval = "Maker: " + getMaker() + "\nModel: " + getModel()
                        + "\nYear: " + getYear() + "\nQty: " + getQty()
                        + "\nPrice: $ " + getPrice() + "\n";

        return retval;
    }
}
