package Day_3_Conditional_Statement;

public class Switch_Statement {
    public static void main(String[] args) {

        int num=5;

        // switch is used beacuse you dont jave to use relational operator like num==2....

        switch(num){
            case 1:
                System.out.println("Monday");
                break; // The moment witch matches its case it try to run all case after its case match to prevent it we use break statement
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Not a valid no. ");

            // Output: Friday

        }
    }
}
