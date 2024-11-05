import java.util.Scanner;

public class ArrayIndex {

    public static void main(String[] args) {
        int nums[] = new int[10];
        Scanner scanner = new Scanner(System.in);

        //keyboard input (integer values)
        System.out.println("Enter 10 integer values:");
        int i = 0;
        while (i < nums.length) {
            System.out.print("Enter value for nums[" + i + "]: ");
            nums[i] = scanner.nextInt();
            i++;
        						}

        // odd indices only
        System.out.println("Values at odd indices:");
        
        for ( i = 0; i < nums.length; i++) {
            if (i % 2 == 0) // skip even indices
                continue;
            System.out.println("nums[" + i + "] = " + nums[i]);
        									  }
        
        scanner.close(); // Close  scanner 
    }
}
