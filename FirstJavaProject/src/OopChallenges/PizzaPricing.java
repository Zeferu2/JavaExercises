package OopChallenges;

import java.util.ArrayList;
import java.util.List;

// Enum for base options
enum Base {
    THIN(8),
    REGULAR(10),
    CHEESY(12);

    private final double baseCost;

    Base(double cost) {
        this.baseCost = cost;
    }

    public double getBaseCost() {
        return baseCost;
    }
}

// Enum for size options
enum Size {
    SMALL(0.75),
    MEDIUM(1.0),
    LARGE(1.25);

    private final double multiplier;

    Size(double multiplier) {
        this.multiplier = multiplier;
    }

    public double getMultiplier() {
        return multiplier;
    }
}

// Enum for toppings
enum Topping {
    CHEESE(2),
    MUSHROOMS(1.5),
    OLIVES(1);

    private final double cost;

    Topping(double cost) {
        this.cost = cost;
    }

    public double getCost() {
        return cost;
    }
}

// Pizza class
class Pizza {
    private Base base;
    private Size size;
    private List<Topping> toppings;

    public Pizza(Base base, Size size) {
        this.base = base;
        this.size = size;
        this.toppings = new ArrayList<>();
    }

    // Add topping to pizza
    public void addTopping(Topping topping) {
        toppings.add(topping);
    }

    // Calculate total cost based on formula
    public double calculatePrice() {
        double baseCost = base.getBaseCost();
        double toppingsCost = 0;
        
        for (Topping topping : toppings) {
            toppingsCost += topping.getCost();
        }
        
        return (baseCost + toppingsCost) * size.getMultiplier();
    }

    @Override
    public String toString() {
        return "Pizza with " + base + " base, " + size + " size, and toppings: " + toppings;
    }
}


public class PizzaPricing {

	public static void main(String[] args) {
        // Example 1: Small thin crust pizza with cheese
        Pizza pizza1 = new Pizza(Base.THIN, Size.SMALL);
        pizza1.addTopping(Topping.CHEESE);
        System.out.println(pizza1);
        System.out.printf("Total Price: $%.2f\n", pizza1.calculatePrice());

        // Example 2: Medium thin crust pizza with cheese
        Pizza pizza2 = new Pizza(Base.THIN, Size.MEDIUM);
        pizza2.addTopping(Topping.CHEESE);
        System.out.println(pizza2);
        System.out.printf("Total Price: $%.2f\n", pizza2.calculatePrice());

        // Example 3: Large regular crust pizza with mushrooms and cheese
        Pizza pizza3 = new Pizza(Base.REGULAR, Size.LARGE);
        pizza3.addTopping(Topping.MUSHROOMS);
        pizza3.addTopping(Topping.CHEESE);
        System.out.println(pizza3);
        System.out.printf("Total Price: $%.2f\n", pizza3.calculatePrice());
    }
}

