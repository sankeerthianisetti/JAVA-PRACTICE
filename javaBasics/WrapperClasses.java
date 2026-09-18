public class WrapperClasses {
    public static void main(String[] args) {
        // Autoboxing: Primitive to Wrapper Object
        int primitiveInt = 25;
        Integer wrapperInt = primitiveInt; 

        // Unboxing: Wrapper Object to Primitive
        Character wrapperChar = 'J';
        char primitiveChar = wrapperChar; 

        System.out.println("Autoboxed Integer: " + wrapperInt);
        System.out.println("Unboxed Character: " + primitiveChar);

        String numberStr = "12345";
        int parsedNumber = Integer.parseInt(numberStr);
        System.out.println("Parsed String to Int: " + (parsedNumber + 5));
    }
}