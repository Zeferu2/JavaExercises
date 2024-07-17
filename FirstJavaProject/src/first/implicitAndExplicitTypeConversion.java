package first;

public class implicitAndExplicitTypeConversion {
	public static void main(String[] args) {
		int intValue =10;
		float floatValue=2.5f;
		double doubleValue =3.5;
		// implicit conversion
		System.out.println("implicit conversion");
		// implicit conversion from integer to float
		float floatFromInt = intValue + floatValue;
		System.out.println("(int to float): " + floatFromInt);
		System.out.println();
		//implicit conversion from integer to double
		double doubleFromInt = intValue + doubleValue;
		System.out.println("(int to double): " + doubleFromInt);
		System.out.println();
		// implicit conversion from float to double
		double doubleFromFloat = floatValue + doubleValue;
		System.out.println("(float to double): " + doubleFromFloat);
		System.out.println();
		// explicit conversion
		System.out.println("Explicit Conversion");
		// explicit conversion from double to float
		float floatFromDouble = (float) doubleValue;
		System.out.println("float From Double: " + floatFromDouble);
		// explicit conversion from double to integer
		byte byteFromDouble = (byte) doubleValue;
		System.out.println("byte from double: " + byteFromDouble);
		// explicit conversion  from float to double
		double doubleFromFloat1 = (double) floatValue;
		System.out.println("double From Float: " + doubleFromFloat1);
		
	} 
 
}
