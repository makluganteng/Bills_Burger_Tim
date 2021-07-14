package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Hamburger hamburger = new Hamburger("Basic", "Sausage", 3.56, "White");
        //double price = hamburger.itemizeHamburger();
        hamburger.addHamburgerAddittion1("tomato",0.27);
        hamburger.addHamburgerAddittion2("lettuce",0.75);
        hamburger.addHamburgerAddittion3("Cheese",1.12);
        System.out.println("Your total is $" + hamburger.itemizeHamburger());

        HealthyBurger healthyBurger = new HealthyBurger("Bacon", 5.67);
        healthyBurger.addHealthAddition1("Egg", 5.43);
        healthyBurger.addHealthAddition2("Lentils", 3.41);
        System.out.println("Total Healthy Burger price is " + healthyBurger.itemizeHamburger());

        DeluxeBurger deluxeBurger = new DeluxeBurger();
        System.out.println("Total Deluxe Burger price is " + deluxeBurger.itemizeHamburger());

    }
}
