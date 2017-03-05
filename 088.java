public class Solution {
  public void merge(int[] nums1, int m, int[] nums2, int n) {
    int i = m - 1, j = n - 1;
    int k = m + n - 1;
    while(i >= 0 || j >= 0) {
      while(i < 0 && j >= 0) {
        nums1[k--] = nums2[j--];
      }
      if(j < 0) {
        break;
      }
      if(nums1[i] > nums2[j]) {
        nums1[k--] = nums1[i--];
      } else {
        nums1[k--] = nums2[j--];
      }
    }
  }
}
