class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> st = new Stack<>();
        int i = 0;
        while (i < asteroids.length) {
            if (st.isEmpty()) {
                st.push(asteroids[i]);
                i++;
                continue;
            } else {
                int el = asteroids[i];
                int top = st.peek(); 
                if (top >= 0) {
                    if (el >= 0) {
                        st.push(el);
                        i++;
                        continue;
                    } else {
                        if (top > Math.abs(el)) {
                            i++;
                            continue;
                        } else if (top == Math.abs(el)){
                            st.pop();
                            i++;
                            continue;
                        } else {
                            st.pop();
                            continue;
                        }
                    }
                } else {
                    // if (el < 0) {
                    //     st.push(el);
                    //     i++;
                    //     continue;
                    // } else {
                    //     if (Math.abs(top) > el) {
                    //         i++;
                    //         continue;
                    //     } else if (Math.abs(top) == el) {
                    //         st.pop();
                    //         continue;
                    //     } else {
                    //         st.pop();
                    //         continue;
                    //     }
                    // }
                    st.push(el);
                    i++;
                }
            }
        }
        int[] arr = new int[st.size()];
        for (int k = st.size() - 1; k >= 0; k--) {
            arr[k] = st.pop();
        }
        return arr;
    }
}