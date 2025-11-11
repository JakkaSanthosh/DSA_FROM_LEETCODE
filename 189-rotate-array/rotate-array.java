class Solution {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        k %= n;

        // Step 1: Reverse entire array
        reverse(nums, 0, n - 1);

        // Step 2: Reverse first k elements
        reverse(nums, 0, k - 1);

        // Step 3: Reverse remaining n-k elements
        reverse(nums, k, n - 1);
    }

    // Helper: XOR-based reverse function
    private void reverse(int[] nums, int left, int right) {
        while (left < right) {
            nums[left] = nums[left] ^ nums[right];
            nums[right] = nums[left] ^ nums[right];
            nums[left] = nums[left] ^ nums[right];
            left++;
            right--;
        }
    }
}
