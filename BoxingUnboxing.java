

public class BoxingUnboxing {
    public static void main(String[] args) {
        int primitiveInt = 10;
        Integer boxedInt = primitiveInt;

        float primitiveFloat = 5.5f;
        Float boxedFloat = primitiveFloat;

        byte primitiveByte = 100;
        Byte boxedByte = primitiveByte;

        char primitiveChar = 'A';
        Character boxedChar = primitiveChar;

        String primitiveString = "Hello";

        int unboxedInt = boxedInt;
        float unboxedFloat = boxedFloat;
        byte unboxedByte = boxedByte;
        char unboxedChar = boxedChar;

        System.out.println("Boxing and Unboxing Demo:");

        System.out.println("Boxed Integer: " + boxedInt + " --> Unboxed Integer: " + unboxedInt);
        System.out.println("Boxed Float: " + boxedFloat + " --> Unboxed Float: " + unboxedFloat);
        System.out.println("Boxed Byte: " + boxedByte + " --> Unboxed Byte: " + unboxedByte);
        System.out.println("Boxed Character: " + boxedChar + " --> Unboxed Character: " + unboxedChar);
        System.out.println("String: " + primitiveString);
    }
}
