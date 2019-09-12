import java.util.Scanner;

public class GeometricMain {
    public static void main(String[] args) {

//        Rectangle rectangle1 = new Rectangle(4, 5);
//        int rectangle1Area = rectangle1.calculateArea();
//        int rectangle1Perimeter = rectangle1.calculatePerimeter();
//
//        System.out.println(rectangle1Area);
//        System.out.println(rectangle1Perimeter);
//        System.out.println("Rectangle1: " + rectangle1);
//
//        Square square1 = new Square(7);
//        int square1Area = square1.calculateArea();
//        int square1Perimeter = square1.calculatePerimeter();
//
//        System.out.println(square1Area);
//        System.out.println(square1Perimeter);
//        System.out.println("Square1: " + square1);
//
//        Circle circle1 = new Circle(9);
//        double circle1Area = circle1.calculateArea();
//        double circle1Perimeter = circle1.calculatePerimeter();
//
//        System.out.println(circle1Area);
//        System.out.println(circle1Perimeter);
//        System.out.println("Circle1: " + circle1);

        boolean stayInLoop = true;
        Scanner in = new Scanner(System.in);
        while (stayInLoop) {
            printChoices();
            while (!in.hasNext("[abcd]")) {
                System.out.println("Not from list");
                in.next();
            }
            Character input = in.next().charAt(0);
            switch (input) {
                case 'a':
                    System.out.println("Your choice is rectangle");
                    System.out.println("Insert width:");
                    int width = in.nextInt();
                    System.out.println("Insert height:");
                    int height = in.nextInt();
                    Rectangle myRectangle = new Rectangle(width, height);
                    System.out.println("Rectangle area is " + myRectangle.calculateArea());
                    System.out.println("Rectangle are is " + myRectangle.calculatePerimeter());
                    break;
                case 'b':
                    System.out.println("Your choice is square");
                    System.out.println("Insert side:");
                    int side = in.nextInt();
                    Square mySquare = new Square(side);
                    System.out.println("Square area is " + mySquare.calculateArea());
                    System.out.println("Square perimeter is " + mySquare.calculatePerimeter());
                    break;
                case 'c':
                    System.out.println("Your choice is circle");
                    System.out.println("Insert radius:");
                    int radius = in.nextInt();
                    Circle myCircle = new Circle(radius);
                    System.out.println("Circle area is " + myCircle.calculateArea());
                    System.out.println("Circle perimeter is " + myCircle.calculatePerimeter());
                    break;
                case 'd':
                    System.out.println("You chose to exit");
                    stayInLoop = false;

            }
        }


    }

    public static void printChoices() {
        System.out.println("Choose a shape: ");
        System.out.println("a) Rectangle");
        System.out.println("b) Square");
        System.out.println("c) Circle");
        System.out.println("d) Exit");
    }
}

