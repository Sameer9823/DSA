
public class InsertArr {
    public static void main(String[] args) {
        int[] intArray = new int[6];
        int length = 0;

        for (int i = 2;i < 6;i++){
            intArray[length] = i ;
            length++;
        }
        intArray[4] = 20;
        for(int i = 0;i < intArray.length; i++){
            System.out.println("Index " + i + " contains " + intArray[i]);
        }

    }
    
}
