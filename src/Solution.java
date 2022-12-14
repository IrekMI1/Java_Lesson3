import java.util.ArrayList;

public class Solution {

    public boolean isArrayListEqual(ArrayList<Integer> intList1, ArrayList<Integer> intList2) {
        if (intList1.size() == intList2.size()) {
            for (int i = 0; i < intList1.size(); i++) {
                if (intList1.get(i) != intList2.get(i)) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    public boolean isSameCount(ArrayList<Integer> list1, ArrayList<Integer> list2, int number) {
        int count1 = 0;
        int count2 = 0;
        for (int item : list1) {
            if (item == number) {
                count1++;
            }
        }
        for (int item : list2) {
            if (item == number) {
                count2++;
            }
        }
        return count1 == count2;
    }
}
