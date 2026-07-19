package Day_2_Operators;

public class Increment {
    public static void main(String[] args){
        int num = 10;

        //Types of increment

        num = num +1;    // 1. Most Common increment
        System.out.println(num);

        num +=1;         //2. Direct Increment
        System.out.println(num);

        num++;           //3. Post-Increment
        System.out.println(num);

        ++num;           //4. Pre-Increment
        System.out.println(num);

        // Difference in  Pre and Post increment

        int num1=10;     //1. Pre-Increment
        int Post_result=++num1;           // First increment the value and then fatch the value
        System.out.println(Post_result);
        // Output:11

        int num2=10;     //2. Post-Increment
        int Pre_Result=num2++;            // First fatch the value and then increment the value
        System.out.println(Pre_Result);
        // Output:10

    }
}


