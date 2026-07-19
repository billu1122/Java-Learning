package Day_2_Operators;

public class Logical_Operator {
    public static void main(String[] args) {
        int a=10;
        int b=5;
        int c=7;
        int d= 24;

        // Types of logical operators.

        boolean and_result= a>=b && c<=d; // AND Operator
        System.out.println(and_result);
        // Output: True

        boolean or_result= a==20-10 || c<=d; // OR Operator
        System.out.println(or_result);
        // Output: True

        boolean not_result= a!=20-10 || c!=d; // NOT Operator
        System.out.println(!not_result);
        // Output: True

    }
}
