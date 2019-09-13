import java.util.Scanner;

public class MainFuel {
    public static void main(String[] args) {


        boolean stayInLoop = true;
        Scanner in = new Scanner(System.in);
        Refuel refuel1 = new Refuel(0, 0);
        while (stayInLoop) {
            printChoices();
            while (!in.hasNext("[ab]")) {
                System.out.println("Not from list. Chose another option");
                in.next();
            }
            Character input = in.next().charAt(0);
            if (input == 'a') {
                System.out.println("You chose to refuel");
                System.out.println("Insert liters of petrol:");
                double petrol = in.nextDouble();
                System.out.println("Insert money:");
                double money = in.nextDouble();
                refuel1.addPetrol(petrol);
                refuel1.addMoney(money);
                System.out.println("You have chosen to refuel with " + refuel1.getPetrol() + " liters of petrol and you have " + refuel1.getMoney() + "$");
            } else {
                refuel1.pay();
                stayInLoop = false;
            }
        }
    }

    public static void printChoices() {
        System.out.println("Choose an action: ");
        System.out.println("a) Continue");
        System.out.println("b) Exit");
    }
}
