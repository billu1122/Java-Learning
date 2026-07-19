public class Operators {
    public static void main(String[] args) {
        double num1 = 3.664;
        int num2 = 4;
        System.out.println(num1 + num2);
        System.out.println(num1 - num2);
        System.out.println(num1 * num2);
        System.out.println(num1 / num2);
        System.out.println(num1 % num2);

        // diff types to modify already existing no.
        num2 = num2 + 1;
        System.out.println(num2); // Yahan num2 update hone ke baad 5 print karega
    }
}