public class DealerApp {
    public static void main(String args[]){
        Automobile automobile = new Automobile();
        Dealer dealer = new Dealer();

        automobile.setMaker("Ford");
        automobile.setModel("F150");
        automobile.setQty(12);
        automobile.setPrice(30000);
        automobile.setYear(2020);

        dealer.addAutomobile(automobile);
        dealer.addAutomobile(new Automobile("Tesla", "S", 2020, 75000, 10));

        System.out.println("Total Car Makers: " + dealer.getTotalCarMakers());
        System.out.println("Total number of cars: " + dealer.getTotalCars());
        for (Automobile item : dealer.getAutomobiles()) {
            System.out.println(item.toString());
        }
    }
}
