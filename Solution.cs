
using System;

public class Solution
{
    public void WiggleSort(int[] input)
    {
        for (int i = 1; i < input.Length; i += 2)
        {
            if (input[i - 1] > input[i])
            {
                swap(i - 1, i, input);
            }
            if (i + 1 < input.Length && input[i + 1] > input[i])
            {
                swap(i + 1, i, input);
            }
        }
    }

    private void swap(int first, int second, int[] input)
    {
        int temp = input[first];
        input[first] = input[second];
        input[second] = temp;
    }
}
