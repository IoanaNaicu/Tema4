public class Refuel {
    private double petrol;
    private double money;
    private final int literOfPetrolPrice = 5;
    private double newPetrol;
    private double newMoney;

    public Refuel(double pretrol, double money) {
        this.petrol = pretrol;
        this.money = money;
    }

    public double getPetrol() {
        return petrol;
    }

    public double getMoney() {
        return money;
    }

    public void setPetrol(double petrol) {
        this.petrol = petrol;
    }

    public void setMoney(double fuel) {
        this.money = money;
    }


    public void addPetrol(double petrol){
        newPetrol =  this.petrol + petrol;
    }

    public double getNewPetrol(){
        return newPetrol;
    }


    public void addMoney(double money){
        newMoney = this.money + money;
    }

    public double getNewMoney(){
        return newMoney;
    }

    public void pay(){
        double moneyRequired = petrol*literOfPetrolPrice;
        if (money > moneyRequired) {
            double rest = money - moneyRequired;
            System.out.println("Your rest is " + rest);
        } else if (money < moneyRequired) {
            double rest = moneyRequired - money;
            System.out.println("You don't have enough money. You need more " + rest + "$");
        } else {
            System.out.println("You are ok. Thank you!");
        }
    }
}
