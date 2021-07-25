public class Classwork_Array2 {
    public static void main(String[] args) {


        int[] integerArray = {10,6,3,4,8,2,12,58,94,33};

        int counter = 0;

        for (int i = 0; i < 10; i++) {
            if (integerArray[i] % 2 == 1) {
                counter += integerArray[i];
                System.out.println("Odd numbers: " + integerArray[i]);
            }
        }
        System.out.println("The sum of all the elements of array is: " + counter);
    }
}
