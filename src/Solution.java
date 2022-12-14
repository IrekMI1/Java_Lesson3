import java.util.ArrayList;
import java.util.Objects;

public class Solution {

    public boolean isArrayListEqual(ArrayList<Integer> intList1, ArrayList<Integer> intList2) {
        if (intList1.size() == intList2.size()) {
            for (int i = 0; i < intList1.size(); i++) {
                if (!intList1.get(i).equals(intList2.get(i))) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }


}
