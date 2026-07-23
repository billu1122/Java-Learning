package Day_4_Loops;

public class Nested_while {
    public static void main(String[] args) {
        int i=1;

        while(i<=5)
        {
            System.out.println("Hi"+i);
            int j=1;
            while(j<=3) {
                System.out.println("Hello" + j);
                j++;
            }

            i++;

        }

        System.out.println("End"+i);
    }
}
