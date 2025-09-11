
public class ArrayLength {
    public static void main(String[] args) {
        int [] numbers = new int[9];

        int length = 0;
        for(int i = 0; i <= 5; i++) {
            length++;
        }
        System.out.println("Length is: " + length);
        System.out.println("Array length is: " + numbers.length);
    }
}
