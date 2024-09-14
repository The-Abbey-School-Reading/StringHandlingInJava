public class MathOperations {
    public static void main(String[] args) {
        // Variables
        int a = 10;
        int b = 3;

        // Division
        int div = a / b;
        System.out.println(a + " / " + b + " = " + div);

        // Modulus
        int mod = a % b;
        System.out.println(a + " % " + b + " = " + mod);

        // Rounding
        double num = 5.67;
        long rounded = Math.round(num);
        System.out.println("Round(" + num + ") = " + rounded);

        // Floor and Ceiling
        double floor = Math.floor(num);
        double ceil = Math.ceil(num);
        System.out.println("Floor(" + num + ") = " + floor);
        System.out.println("Ceil(" + num + ") = " + ceil);
    }
}
