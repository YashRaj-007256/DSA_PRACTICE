class Solution {
    public void nextPermutation(int[] nums) {

        int pivot = -1;
        int len = nums.length;

        
        for (int i = len - 2; i >= 0; i--) {
            if (nums[i] < nums[i + 1]) {
                pivot = i;
                break;
            }
        }

        
        if (pivot == -1) {
            reverse(nums, 0, len - 1);
            return;
        }

        
        for (int i = len - 1; i > pivot; i--) {
            if (nums[pivot] < nums[i]) {
                swap(nums, pivot, i);
                break;
            }
        }

        
        reverse(nums, pivot + 1, len - 1);
    }

    private void reverse(int[] nums, int start, int end) {
        while (start < end) {
            swap(nums, start, end);
            start++;
            end--;
        }
    }

    private void swap(int[] arr, int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}