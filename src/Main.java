import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Solution sln = new Solution();
        ArrayList<Integer> list1 = new ArrayList<>(Arrays.asList(10, 4, 5, 6, 7, 2, 2, 9));
        System.out.println(list1);
        System.out.println(sln.sortEven(list1));
    }
}