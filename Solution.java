
public class Solution {

    public void wiggleSort(int[] input) {
        for (int i = 1; i < input.length; i += 2) {
            if (input[i - 1] > input[i]) {
                swap(i - 1, i, input);
            }
            if (i + 1 < input.length && input[i + 1] > input[i]) {
                swap(i + 1, i, input);
            }
        }
    }

    private void swap(int first, int second, int[] input) {
        int temp = input[first];
        input[first] = input[second];
        input[second] = temp;
    }
}
