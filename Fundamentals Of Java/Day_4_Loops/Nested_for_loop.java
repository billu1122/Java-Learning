package Day_4_Loops;

public class Nested_for_loop {
    public static void main(String[] args) {

        // for loop is also helpful to increase code reusability and decrease its redundancy
        for(int i=1;i<=5;i++)
        {
            System.out.println("Days:"+i);

            for(int j=1;j<=9;j++)
            {
                System.out.println(" " + (j+8) + "-" + (j+9));
            }
        }
    }
}
