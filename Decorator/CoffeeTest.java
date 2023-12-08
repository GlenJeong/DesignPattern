package DesignPattern.Decorator;

public class CoffeeTest {

    public static void main(String[] args) {
        System.out.println("Americano");
        Coffee coffee = new Americano();
        coffee.brewing();

        System.out.println();

        System.out.println("lattCoffee");
        Coffee lattCoffee = new Latte(coffee);
        lattCoffee.brewing();

        System.out.println();

        System.out.println("mochaCoffee");
        Coffee mochaCoffee = new Mocha(lattCoffee);
        mochaCoffee.brewing();

        System.out.println();

        System.out.println("WhippingCreamCoffee");
        Coffee WhippingCreamCoffee = new WhippedCream(new Mocha(new Latte(new Americano())));
        WhippingCreamCoffee.brewing();
        System.out.println();
    }

}
