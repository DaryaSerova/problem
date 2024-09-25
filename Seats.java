public class Seats {
    public static void main(String[] args) {
        int[] nums1 = new int[]{0, 0, 0, 1, 1, 0, 1};
        chairCounter(nums1);
        int[] nums2 = new int[]{1, 0, 0, 0, 1, 0, 1};
        chairCounter(nums2);
        int[] nums3 = new int[]{1, 0, 1};
        chairCounter(nums3);
        int[] nums4 = new int[]{1, 0, 0, 0, 0, 0, 0};
        chairCounter(nums4);
    }

    public static int chairCounter(int[] nums) {
        int head = 0;
        int tail = 0;
        int answer = 0;
        while (tail < nums.length) {
            if (nums[tail] == 1 || tail == nums.length - 1) {
                if (nums[head] == 0) {
                    answer = Math.max(tail - head, answer);
                } else {
                    answer = Math.max((tail - head + 1) / 2, answer);
                }
                head = tail;
            }
            tail++;
        }
        return answer;
    }
}
