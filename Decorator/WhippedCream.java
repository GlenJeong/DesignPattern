package DesignPattern.Decorator;

public class WhippedCream extends Decorator {

    public WhippedCream(Coffee coffee) {
        super(coffee);
    }

    public void brewing() {
        super.brewing();
        System.out.println("Adding Whipping Cream ");
    }

}
