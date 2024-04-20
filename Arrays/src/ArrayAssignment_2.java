public class ArrayAssignment_2 {
    public static int[] Triplets(int[] nums) {
        int triplets[] = new int[3];
        for (int i = 0; i < triplets.length; i++) {
            for (int j = i + 1; j < triplets.length; j++) {
                for (int k = j + 1; k < triplets.length; k++) {
                    if (i != j && i != k && j != k && nums[i] + nums[j] + nums[k] == 0) {
                        triplets[0] = nums[i];
                        triplets[1] = nums[j];
                        triplets[2] = nums[k];
                    }
                }
            }
        }
        System.out.println(triplets[0]+triplets[1]+triplets[2]);
        return triplets;
    }

    public static void main(String arg[]) {
        int nums[] = {-1, 0, 2, -1, -1};
        Triplets(nums);
    }
}
