class Solution {
    public int maxNumberOfBalloons(String text) {
        HashMap<Character, Integer> map = new HashMap<>();
        for (char c : text.toCharArray()) {
            if (c == 'b' || c == 'a' || c == 'n' || c == 'l' || c == 'o') {
                map.put(c, map.getOrDefault(c, 0) + 1);
            }
        }
        map.putIfAbsent('b' , 0);
        map.putIfAbsent('a' , 0);
        map.putIfAbsent('n' , 0);
        map.putIfAbsent('l' , 0);
        map.putIfAbsent('o' , 0);
        map.put('l' , map.get('l')/2);
        map.put('o' , map.get('o')/2);
        int min = Integer.MAX_VALUE;
        for (int val : map.values()) {
            min = Math.min(min, val);
        }
        return min;
    }
}