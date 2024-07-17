package first;

public class maxAndMinPrimitiveDataType {

	public static void main(String[] args) {
	
		// for byte
		
		System.out.println("byte: ");
		System.out.println("Max: " + Byte.MAX_VALUE);
        System.out.println("Min: " + Byte.MIN_VALUE);
        System.out.println();
        
        // for short
        System.out.println("short: ");
        System.out.println("Max: " + Short.MAX_VALUE);
        System.out.println("Max: " + Short.MIN_VALUE);
        System.out.println();
        
        // For integer
        System.out.println("Integer: ");
        System.out.println("Max: "+ Integer.MAX_VALUE);
        System.out.println("Min: "+ Integer.MIN_VALUE);
        System.out.println();
        // Long 
        
        System.out.println("Long: ");
        System.out.println("Max: " +Long.MAX_VALUE);
        System.out.println("Min: " + Long.MIN_VALUE);
        System.out.println();
        
        // Float
        System.out.println("Float:");
        System.out.println("Max: " + Float.MAX_VALUE);
        System.out.println("Min: " + -Float.MAX_VALUE);
        System.out.println("Min (Positive Non-Zero): " + Float.MIN_VALUE);
        System.out.println();
        
        // Double
        System.out.println("Double: ");
        System.out.println("Max: " + Double.MAX_VALUE);
        System.out.println("Min: " + -Double.MAX_VALUE);
        System.out.println("Min (Positive Non-Zero): " + Double.MIN_VALUE);
        // Character
        System.out.println("\nCharacter:");
        System.out.println("Max: " + (int) Character.MAX_VALUE);
        System.out.println("Min: " + (int) Character.MIN_VALUE);
        
        // Boolean
        System.out.println("\nBoolean:");
        System.out.println("Values: " + Boolean.TRUE + ", " + Boolean.FALSE);
        
	}

}
