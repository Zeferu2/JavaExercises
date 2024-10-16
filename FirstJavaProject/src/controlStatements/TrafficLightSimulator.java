package controlStatements;

public class TrafficLightSimulator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 // Ask the user to enter a traffic light color
        System.out.print("Enter the traffic light color (red, yellow, green): ");
        String color = "red";

        // Determine the corresponding instruction
        String instruction;
        switch (color) {
            case "red":
                instruction = "stop";
                
            case "yellow":
                instruction = "ready to stop";
                break;
            case "green":
                instruction = "go";
                break;
            default:
                instruction = "Error: Invalid color.";
                break;
        }

        // Display the result
        System.out.println(instruction);

	}

}
