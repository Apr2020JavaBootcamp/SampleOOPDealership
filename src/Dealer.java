import java.util.ArrayList;

public class Dealer {
    private String name;
    private int totalCars;
    private ArrayList<Automobile> automobiles;

    public Dealer() {
        name = "";
        totalCars = 0;
        automobiles = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getTotalCars() {
        int totalCars = 0;

        for (Automobile item : automobiles) {
            totalCars += item.getQty();
        }

        return totalCars;
    }

    public int getTotalCarMakers() {
        int totalCars = 0;

        totalCars = automobiles.size();
        return totalCars;
    }

    public ArrayList<Automobile> getAutomobiles() {
        return automobiles;
    }

    public void setAutomobiles(ArrayList<Automobile> automobiles) {
        this.automobiles = automobiles;
    }

    public void addAutomobile(Automobile automobile) {
        this.automobiles.add(automobile);
    }

}
