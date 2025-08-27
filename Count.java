public class Count {

    public static void main(String[] args) {
        int[] numbers = {10, 60, 30, 80, 45, 90, 20, 55};
        int count = 0;

        for (int number : numbers) {
            if (number > 50) {
                count++;
            }
        }

        System.out.println("Number of elements greater than 50: " + count);
    }
}