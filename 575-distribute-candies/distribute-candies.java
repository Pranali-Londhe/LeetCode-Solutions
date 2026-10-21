import java.util.*;

class Solution {
    public int distributeCandies(int[] candyType) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int candy : candyType) {
            map.put(candy, 1);
        }

        return Math.min(map.size(), candyType.length / 2);
    }
}