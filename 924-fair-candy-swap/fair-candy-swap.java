
import java.util.HashSet;
import java.util.Set;

class Solution {
    public int[] fairCandySwap(int[] aliceSizes, int[] bobSizes) {
        int sumAlice = 0;
        int sumBob = 0;

        for (int candy : aliceSizes) {
            sumAlice += candy;
        }

        for (int candy : bobSizes) {
            sumBob += candy;
        }

        int diff = (sumBob - sumAlice) / 2;

        Set<Integer> bobSet = new HashSet<>();

        for (int candy : bobSizes) {
            bobSet.add(candy);
        }

        for (int x : aliceSizes) {
            int y = x + diff;

            if (bobSet.contains(y)) {
                return new int[]{x, y};
            }
        }

        return new int[0];
    }
}
