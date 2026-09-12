class Solution {
    public int[] findEvenNumbers(int[] digits) {
        ArrayList<Integer> arr = new ArrayList<>();
        int[] freq = new int[10];
        for (int n : digits) {
            freq[n]++;
        }
        for (int i = 1; i <= 9; i++) {
            if (freq[i] == 0) continue;
            int temp = 0;
            temp += i;
            freq[i]--;
            for (int j = 0; j <= 9; j++) {
                if (freq[j] == 0) continue;
                temp *= 10;
                temp += j;
                freq[j]--;
                for (int k = 0; k <= 8; k+=2) {
                    if (freq[k] > 0) {
                    temp *= 10;
                    temp += k;
                    arr.add(temp);
                    temp /= 10;}
                }
                freq[j]++;
                temp /= 10;
            }
            freq[i]++;
            
        }
        return arr.stream().mapToInt(Integer::intValue).toArray();
    }
}