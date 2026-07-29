class Solution {
    public int romanToInt(String s) {
        Map<Character, Integer> roman = Map.of('I', 1,
                                               'V', 5,
                                               'X', 10,
                                               'L', 50,
                                               'C', 100,
                                               'D', 500,
                                               'M', 1000);

        int res = 0;
        char[] ch = s.toCharArray();
        for (int i = 0; i < ch.length; i++) {
            if (i + 1 < ch.length && roman.get(ch[i]) < roman.get(ch[i + 1]))
                res -= roman.get(ch[i]);
            else
                res += roman.get(ch[i]);
        }

        return res;
    }
}