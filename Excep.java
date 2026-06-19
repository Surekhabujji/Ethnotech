public class Excep {
    public static void main(String[] args) {

        try {
            int arr[] = {5, 0, 8, 9};

            try {
                int x = arr[3] / arr[1];
            }
            catch (ArithmeticException ae) {
                System.out.println("divide by zero");
            }

            arr[4] = 3;
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array index out of bounds");
        }
        finally {
            System.out.println("finally block is always executed");
        }

        System.out.println("rest of the code....");
    }
}