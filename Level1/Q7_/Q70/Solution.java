package Level1.Q7_.Q70;

import java.util.ArrayList;
import java.util.List;

public class Solution {

    public int[][] solution(int[][] data, String ext, int val_ext, String sort_by) {
        String[] test = {"code", "date", "maximum", "remain"};
        int extNum = 0;
        int sort_byNum = 0;
        List<int[]> list = new ArrayList<>();

        for (int i = 0; i < test.length; i++) {
            if (test[i].equals(ext)) {
                extNum = i;
                break;
            }
        }

        for (int i = 0; i < test.length; i++) {
            if (test[i].equals(sort_by)) {
                sort_byNum = i;
                break;
            }
        }

        for (int i = 0; i < data.length; i++) {
            if (data[i][extNum] < val_ext) {
                list.add(data[i]);
            }
        }

        final int sortIndex = sort_byNum;

        list.sort((a, b) -> Integer.compare(a[sortIndex], b[sortIndex]));

        return list.toArray(new int[list.size()][]);
    }
}
