import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Solution sln = new Solution();
        ArrayList<Integer> list1 = new ArrayList<>(Arrays.asList(3, 5, 7, 9, 1, 1, 7));
        System.out.println(list1);
        System.out.println(sln.sortEven(list1));
    }
}