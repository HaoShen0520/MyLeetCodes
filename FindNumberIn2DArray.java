public class FindNumberIn2DArray {
    public boolean findNumberIn2DArray(int[][] matrix, int target) {
        if (matrix == null) {
            return false;
        }

        if (matrix.length == 0) {
            return false;
        }

        if (matrix[0].length == 0) {
            return false;
        }

        int cur_row = 0;
        int cur_col = matrix[0].length - 1;

        while (cur_row < matrix.length && cur_col > 0) {
            int cur = matrix[cur_row][cur_col];

            if (cur == target) {
                return true;
            }
            if (cur > target) {
                cur_col--;
                continue;
            }
            cur_row++;
        }

        return false;
    }
}
