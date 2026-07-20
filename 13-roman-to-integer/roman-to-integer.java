class Solution {
    public int romanToInt(String s) {
        int roman[] = {'I','V','X','L','C','D','M'};
        int value[] = {1,5,10,50,100,500,1000};

        char[] chars = s.toCharArray();
        int len = chars.length;

        int val = 0;
        int previous_value = 0;

        for (int i = 0; i < len; i++) {

            int current_value = 0;

            // Find the value of the current Roman numeral
            for (int j = 0; j < roman.length; j++) {
                if (roman[j] == chars[i]) {
                    current_value = value[j];
                    break;
                }
            }

            // Apply the Roman numeral rule
            if (previous_value < current_value) {
                val += current_value - 2 * previous_value;
            } else {
                val += current_value;
            }

            // Update previous value
            previous_value = current_value;
        }

        return val;
    }
}