public class Task2 {
    public static void main(String[] args) {

        int[] intArray = {2, 4, 25, 85, 234, 4678, 213, 654, 674, 23};
        //int[] intArray = {2, 4, 25, 85, 234};
        try {
            int d = 0;
            double catchedRes1 = intArray[8] / d;
            System.out.println("catchedRes1 = " + catchedRes1);
        } catch (ArithmeticException e) {
            System.out.println("Catching exception: " + e.getMessage());
        } catch (RuntimeException e) {
            System.out.println("Catching exception: " + e.getMessage());
        }
    }
}
