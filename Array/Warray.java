

public class Warray {
    public static void main(String[] args) {
        int [] numbers = new int[9];

        for (int i = 0; i < numbers.length; i++) {
            int square = i * i;
            numbers[i] = square;
            System.out.println(numbers[i]);
        }


    }
    
}
