import java.util.ArrayList;
import java.util.Iterator;

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

    public ArrayList<Integer> sortEven(ArrayList<Integer> list) {
        for (int i = list.size() - 1; i > 0; i--) {
            while (list.get(i) % 2 != 0) {
                i--;
            }
            for (int j = 0; j < i; j++) {
                if (list.get(j) > list.get(i) && list.get(j) % 2 == 0) {
                    int temp = list.get(i);
                    list.set(i, list.get(j));
                    list.set(j, temp);
                }
            }
        }
        return list;
    }

    public ArrayList<Integer> removeEven(ArrayList<Integer> intList) {
        Iterator<Integer> intIter = intList.iterator();
        while (intIter.hasNext()) {
            if (intIter.next() % 2 == 0) {
                intIter.remove();
            }
        }
        return intList;
    }
}
