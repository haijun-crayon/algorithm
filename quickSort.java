    public int[] kSort(int[] nums) {
        kuiSort(nums, 0, nums.length - 1);
        return nums;
    }

    private void kuiSort(int[] nums, int i, int j) {
        int left = i;
        int right = j;
        if (i >= j) return;
        while (i < j) {
            while (nums[j] >= nums[i] && i < j) {
                j--;
            }
            if (i < j) {
                swap(nums, i, j);
            }
            while (nums[i] <= nums[j] && i < j) {
                i++;
            }
            if (i < j) {
                swap(nums, i, j);
            }
        }
        kuiSort(nums, left, i - 1);
        kuiSort(nums, i + 1, right);
    }
    private void swap(int[] nums, int i, int j) {
        int tmp = nums[j];
        nums[j] = nums[i];
        nums[i] = tmp;
    }
