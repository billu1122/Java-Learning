package Day_4_Loops;

public class Do_while_loop {
    public static void main(String[] args) {
        int i=1;

        // do block will at least run once even when while loop condition is false

        do {
            System.out.println(i);
            i++;
        }while(i<10);
    }
}
