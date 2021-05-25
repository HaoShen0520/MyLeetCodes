import java.util.*;

public class YangHui {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> output = new ArrayList<>();
        ArrayList<Integer> row = new ArrayList<>();
        for (int i = 0; i < numRows; i++) {
            row.add(0, 1);
            for (int j = 1; j < row.size() - 1; j++)
                row.set(j, row.get(j) + row.get(j + 1));

            output.add(new ArrayList<>(row));
        }

        return output;
    }

    public static void main(String[] args){
        YangHui yh = new YangHui();
        List<List<Integer>> output = yh.generate(10);
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 10; i++) {
            List<Integer> row = output.get(i);
            String temp = "";
            for (int j = 0; j < row.size(); j++) {
                if (j == row.size() - 1) {
                    temp += row.get(j);
                } else {
                    temp += row.get(j) + " ";
                }
            }
            System.out.println(temp);
        }
    }
}
