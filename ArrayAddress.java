public class ArrayAddress {

    public static void main(String[] args) {
        int[] arr = new int[3];

        for (int i = 0; i < arr.length; i++) {
            System.out.println("Unique identifier for arr[" + i + "]: " + System.identityHashCode(arr[i]));
        }
    }
}

