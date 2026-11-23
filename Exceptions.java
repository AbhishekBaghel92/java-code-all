public class Exceptions {
    public static void main(String[] args) {
        try {
            int result = 10 / 0;
            System.out.println(result);
        } catch (ArithmeticException e) {
            System.out.println("Error: Cannot divide by zero!");
        } finally {
            System.out.println("Program execution finished");
        }

        try {
            int[] arr = new int[5];
            arr[10] = 1;
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Caught: Array index out of bounds");
        } catch (Exception e) {
            System.out.println("Caught: General exception");
        }
    }
}
