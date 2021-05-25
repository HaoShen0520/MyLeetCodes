import java.util.Arrays;

public class FindMedianSortedArray {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] array = new int[nums1.length + nums2.length];

        System.arraycopy(nums1, 0, array, 0, nums1.length);
        System.arraycopy(nums2, 0, array, nums1.length, nums2.length);

        Arrays.sort(array);

        String s = "";
        for (int i = 0; i < array.length; i++) {
            s += array[i] + " ";
        }
        System.out.println(s);

        if (array.length % 2 != 0) {
            return (double) array[array.length / 2];
        } else {
            double result = (double) (array[array.length / 2 - 1] + array[array.length / 2 ]) / 2;
            return result;
        }
    }
}
