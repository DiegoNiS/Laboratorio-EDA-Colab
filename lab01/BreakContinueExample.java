public class BreakContinueExample {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == 3) {
                break;
            }
            if (numbers[i] == 2) {
                continue;
            }
            System.out.println(numbers[i]);
        }
    }
}

