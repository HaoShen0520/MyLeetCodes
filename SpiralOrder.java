public class SpiralOrder {
    public int[] spiralOrder(int[][] matrix) {
        int[] ans = new int[matrix.length * matrix[0].length];
        
        boolean[][] map = new boolean[matrix.length][matrix[0].length];

        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map.length; j++) {
                map[i][j] = false;
            }
        }

        return null;
    }
}
