package Day_3_Conditional_Statement;

public class Comparing_3_variable {
    public static void main(String[] args) {
        int x = 8;
        int y = 7;
        int z = 6;

        if(x>y && x>z)
            System.out.println("x is greatest");

        else if (y>x && y>z)
            System.out.println("y is greatest");

        else
            System.out.println("z is greatest");



    }
}
