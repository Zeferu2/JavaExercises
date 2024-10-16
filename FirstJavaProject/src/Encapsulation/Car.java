package Encapsulation;

public class Car {// Private attributes
    private int speed;       // Speed of the car in km/h
    private String color;    // Color of the car

    // Constructor to initialize Car object
    public Car(String color) {
        this.color = color;   // Set the color of the car
        this.speed = 0;       // Initial speed is 0
    }

    // Getter for speed
    public int getSpeed() {
        return speed;
    }

    // Getter for color
    public String getColor() {
        return color;
    }

    // Method to accelerate the car
    public void accelerate(int increment) {
        if (increment > 0) {
            speed += increment;  // Increase speed
            System.out.println("Accelerated to " + speed + " km/h.");
        } else {
            System.out.println("Invalid acceleration value.");
        }
    }

    // Method to brake the car
    public void brake(int decrement) {
        if (decrement > 0) {
            speed -= decrement;  // Decrease speed
            if (speed < 0) {
                speed = 0;       // Speed cannot go below 0
            }
            System.out.println("Slowed down to " + speed + " km/h.");
        } else {
            System.out.println("Invalid braking value.");
        }
    }

    // Method to display car details
    public void displayDetails() {
        System.out.println("Car Color: " + color);
        System.out.println("Current Speed: " + speed + " km/h");
    }



	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 // Create a Car object
        Car myCar = new Car("Red");
        
        // Display initial details
        myCar.displayDetails();  // Output: Car Color: Red, Current Speed: 0 km/h

        // Accelerate the car
        myCar.accelerate(30);    // Output: Accelerated to 30 km/h.
        myCar.displayDetails();   // Output: Car Color: Red, Current Speed: 30 km/h

        // Brake the car
        myCar.brake(10);         // Output: Slowed down to 20 km/h.
        myCar.displayDetails();   // Output: Car Color: Red, Current Speed: 20 km/h

        // Brake more than current speed
        myCar.brake(25);         // Output: Slowed down to 0 km/h.
        myCar.displayDetails();   // Output: Car Color: Red, Current Speed: 0 km/h

	}

}
