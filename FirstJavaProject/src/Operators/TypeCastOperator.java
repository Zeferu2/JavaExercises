package Operators;

public class TypeCastOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 // Widening conversion (implicit)
        int intVal = 100;
        long longVal = intVal; // int to long
        float floatVal = intVal; // int to float

        System.out.println("Widening Conversion:");
        System.out.println("int value: " + intVal);
        System.out.println("long value (from int): " + longVal);
        System.out.println("float value (from int): " + floatVal);

        // Narrowing conversion (explicit)
        double doubleVal = 100.04;
        int narrowedIntVal = (int) doubleVal; // double to int
        float narrowedFloatVal = (float) doubleVal; // double to float

        System.out.println("\nNarrowing Conversion:");
        System.out.println("double value: " + doubleVal);
        System.out.println("int value (from double): " + narrowedIntVal);
        System.out.println("float value (from double): " + narrowedFloatVal);
        
        // Additional example of narrowing with potential data loss
        long largeLongVal = 123456789L;
        int narrowedIntFromLong = (int) largeLongVal; // long to int
        System.out.println("\nNarrowing Conversion with potential data loss:");
        System.out.println("long value: " + largeLongVal);
        System.out.println("int value (from long): " + narrowedIntFromLong);

	}

}
