import java.util.*;

public class TopFrequent {
    public List<String> topKFrequent(String[] words, int k) {
        HashMap<String, Integer> hashmap = new HashMap<>();
        int dul = 0;
        for (String word : words) {
            if (hashmap.containsKey(word)) {
                int temp = hashmap.get(word);
                temp++;
                hashmap.put(word, temp);
                dul++;
            } else {
                hashmap.put(word, 1);
            }
        }

        List<String> ans = new ArrayList<>();
        String[] sorted = new String[words.length - dul];
        int[] fre = new int[words.length - dul];

        int index = 0;

        for (String key : hashmap.keySet()) {
            sorted[index] = key;
            fre[index] = hashmap.get(key);
            index++;
        }


        int current;
        String cur;
        for (int i = 0; i < fre.length - 1; i++) {
            current = fre[i + 1];
            cur = sorted[i + 1];
            int preIndex = i;
            while ((preIndex >= 0 && current < fre[preIndex]) || (preIndex >= 0 && current == fre[preIndex] && cur.compareTo(sorted[preIndex]) > 0)) {
                fre[preIndex + 1] = fre[preIndex];
                sorted[preIndex + 1] = sorted[preIndex];
                preIndex--;
            }
            fre[preIndex + 1] = current;
            sorted[preIndex + 1] = cur;
        }

        for (int i = sorted.length-1; i > sorted.length - k - 1 ; i--) {
            ans.add(sorted[i]);
        }

        return ans;
    }

    public static void main(String[] args) {
        TopFrequent t = new TopFrequent();
        String[] s = {"i", "love", "leetcode", "i", "love", "coding"};
        List<String> ans = t.topKFrequent(s,3);
        System.out.println(ans);
    }
}
