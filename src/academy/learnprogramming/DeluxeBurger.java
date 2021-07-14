package academy.learnprogramming;

public class DeluxeBurger extends Hamburger{
    public DeluxeBurger() {
        super("Deluxe", "Sausage and Bacon", 14.54, "White");
        super.addHamburgerAddittion1("Chips", 2.75);
        super.addHamburgerAddittion2("Drink", 1.81);
    }
    // how to net let user can add addition by changing the code using override method
    @Override
    public void addHamburgerAddittion1(String name, double price) {
        System.out.println("Cannot add additional items to a deluxe burger");
    }

    @Override
    public void addHamburgerAddittion2(String name, double price) {
        System.out.println("Cannot add additional items to a deluxe burger");
    }

    @Override
    public void addHamburgerAddittion3(String name, double price) {
        System.out.println("Cannot add additional items to a deluxe burger");
    }

    @Override
    public void addHamburgerAddittion4(String name, double price) {
        System.out.println("Cannot add additional items to a deluxe burger");
    }
}
