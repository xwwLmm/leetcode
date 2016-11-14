package algorithms3;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by xieww on 2016/11/12.
 */
public class LongestSubstring {

    public static void main(String[] args) {
        System.out.println(lengthOfLongestSubstring("abcabcbb"));
    }

    public static int lengthOfLongestSubstring(String s) {
        char[] arr = s.toCharArray();
        int result = 0, last = 0;
        for (int i = 0, len = arr.length; i < len; i++) {
            if (i == 0) {
                result = 1;
                continue;
            }
            int start = i - 1;
            while (start >= last) {
                if (arr[start] == arr[i]) {
                    last = start + 1;
                    break;
                }

                if ((i - start + 1) > result) {
                    result = i - start + 1;
                }
                start--;
            }
        }
        return result;
    }
}
