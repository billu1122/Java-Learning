// First Program using variable in java
public class Variable {
    public static void main(String[] args) {

        int num = 3 + 6;
        int num2 = 9 + 2;
        int result = num + num2;
        System.out.println(result);

        int integer_value = 10;
        boolean bool_value = false;
        float float_value = 3.14f;
        String String_value = "Bilal";
        System.out.println(integer_value + ", " + bool_value + ", " + float_value + ", " + String_value);

        int num3=100_000_000; // can use _ to count no. of zeros easily without effecting its output
        System.out.println(num3);
    }
}