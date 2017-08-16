/**
 * 旋转数组（常见的几种方法）
 * Created by 小易 on 2017/8/8.
 */
public class RotateArray {
    /**
     * 将数组右边起k个移动到前面(space O(n); time O(n))
     * @param nums
     * @param k
     */
    public void rotate(int[] nums, int k) {
        if(k > nums.length)
            k=k%nums.length;

        int[] result = new int[nums.length];

        for(int i=0; i < k; i++){
            result[i] = nums[nums.length-k+i];
        }

        int j=0;
        for(int i=k; i<nums.length; i++){
            result[i] = nums[j];
            j++;
        }

        System.arraycopy( result, 0, nums, 0, nums.length );
    }


    /**
     * 将数组左边k个元素移动到右边(space O(n); time O(n))
     * 算法sixiang：声明一个与数组array等长的数组result，设置result的后k位为array的前k位，
     * 然后设置result的前array.length-k位的值为array的后array.length-k的值，最后copy result的值给array
     * @param nums
     * @param k
     */
    public void rotate1(int[] nums, int k) {
        if(k > nums.length)
            k = k%nums.length;

        int[] result = new int[nums.length];

        for(int i=0; i < k; i++){
            result[nums.length - k + i] = nums[i];
        }

        int j=0;
        for(int i=k; i<nums.length; i++){
            result[j] = nums[i];
            j++;
        }

        System.arraycopy( result, 0, nums, 0, nums.length );
    }

    /**
     * 将数组右边k个元素移动到左边(space O(1); time O(n))
     * 算法思想：按照order把数组分array成两部分array1、array2，然后分别反转array1、array2，最后再反转整个数组
     * @param arr
     * @param order
     */
    public static void rotate2(int[] arr, int order) {
        if (arr == null || arr.length==0 || order < 0) {
            throw new IllegalArgumentException("Illegal argument!");
        }

        if(order > arr.length){
            order = order %arr.length;
        }

        //length of first part
        int a = arr.length - order;

        reverse(arr, 0, a-1);
        reverse(arr, a, arr.length-1);
        reverse(arr, 0, arr.length-1);

    }

    /**
     * 将数组左边k个元素移动到右边(space O(1); time O(n))
     * @param arr
     * @param k
     */
    public void rotate3(int[] arr, int k){
        if(arr == null || arr.length == 0 || k < 0)
            throw new IllegalArgumentException("Illegal argument!");
        if(k > arr.length)
            k = k % arr.length;
        reverse(arr, 0, k-1);
        reverse(arr, k, arr.length -1);
        reverse(arr, 0, arr.length -1);
    }

    /**
     * 将数组左边k个元素移动到右边(space O(n); time O(n))
     * 算法思想：利用java % 取模特性，完成对应位置对应赋值
     * @param arr
     * @param k
     */
    public void rotate4(int [] arr, int k){
        if(k < arr.length) k = k%arr.length;
        int [] result = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            result[(i+k) % arr.length] = arr[i];
        }
        System.arraycopy(result, 0, arr, 0, arr.length);
    }

    /**
     * 数组反转方法
     * @param arr 原数组
     * @param left 反转起点
     * @param right 反转结束位置
     */
    public static void reverse(int[] arr, int left, int right){
        if(arr == null || arr.length == 1)
            return;

        while(left < right){
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
    }

}
