package String;

public class InPlaceReverse {
    public static void reverse(String[] str) {
        int left = 0;
        int right = str.length - 1;

        while (left < right) {
            // Swap str[left] and str[right]
            String temp = str[left];
            str[left] = str[right];
            str[right] = temp;

            left++;
            right--;
        }

        // Print reversed array
        for (String s : str) {
            System.out.print(s + " ");
        }
    }

    public static void main(String[] args) {
        String[] str = {"h", "e", "l", "l", "o"};
        reverse(str);  // Output: o l l e h
    }
}
