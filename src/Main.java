import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Solution sln = new Solution();
        ArrayList<Integer> list1 = new ArrayList<>(Arrays.asList(1, 3, 4, 4));
        ArrayList<Integer> list2 = new ArrayList<>(Arrays.asList(1, 3, 4));
        System.out.println(sln.isSameCount(list1, list2, 5));
    }
}