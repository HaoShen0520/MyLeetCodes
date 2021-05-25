public class SeatManager {
    private int n;
    private boolean[] map;

    public SeatManager(int n) {
        this.n = n;
        this.map = new boolean[n];

        for (int i = 0; i < n; i++) {
            map[i] = true;
        }
    }

    public int reserve() {
        int result = -1;
        for (int i = 0; i < n; i++) {
            if (map[i] == true) {
                map[i] = false;
                result = i + 1;
                break;
            }
        }

        return result;
    }

    public void unreserve(int seatNumber) {
        map[seatNumber - 1] = true;
    }
}
