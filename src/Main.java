import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Solution sln = new Solution();
        ArrayList<Integer> list1 = new ArrayList<>(Arrays.asList(1, 2, 4));
        ArrayList<Integer> list2 = new ArrayList<>(Arrays.asList(1, 2, 3));
        System.out.println(sln.isArrayListEqual(list1, list2));
    }
}