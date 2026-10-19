
class Solution {
    public int romanToInt(String s) {
        int ans = 0;

        for (int i = 0; i < s.length(); i++) {
            int n = 0;

            switch (s.charAt(i)) {
                case 'I': n = 1; break;
                case 'V': n = 5; break;
                case 'X': n = 10; break;
                case 'L': n = 50; break;
                case 'C': n = 100; break;
                case 'D': n = 500; break;
                case 'M': n = 1000; break;
            }

            if (i + 1 < s.length() &&
                n < getValue(s.charAt(i + 1))) {
                ans -= n;
            } else {
                ans += n;
            }
        }

        return ans;
    }

    public int getValue(char c) {
        switch (c) {
            case 'I': return 1;
            case 'V': return 5;
            case 'X': return 10;
            case 'L': return 50;
            case 'C': return 100;
            case 'D': return 500;
            case 'M': return 1000;
            default: return 0;
        }
    }
}
