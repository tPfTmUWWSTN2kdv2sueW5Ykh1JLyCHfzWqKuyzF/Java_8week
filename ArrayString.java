
public class ArrayString {

	public static void main(String[] args) {
        int arr[] = {1, 2, 3};
        String[] games = {"Star Wars", "Ghost Of Tsushima", "The Last Of Us"};
        
        // Printing the integer array
        System.out.println("Integer array elements:");
        for (int num : arr) {
            System.out.println(num);
        }

        // Printing the games array
        System.out.println("\nGames list:");
        for (String game : games) {
            System.out.println(game);
        }
        
        String[] strarr= {"프로그래밍","완전","ㄴ","ㅇ","ㄴ","좋아요","ㅈ"};
        System.out.printf("\n%s, %s,%s!", strarr[0], strarr[1], strarr[5] );
    }
}