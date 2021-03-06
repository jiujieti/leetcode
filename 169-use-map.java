public class Solution {
  public int majorityElement(int[] nums) {
    Map<Integer, Integer> map = new HashMap<>();
    for(int num : nums) {
      if(map.containsKey(num)) {
        map.put(num, map.get(num) + 1);
      } else {
        map.put(num, 1);
      }
    }
    int occurs = 0, max = 0;
    for(int key : map.keySet()) {
      if(map.get(key) > occurs) {
        occurs = map.get(key);
        max = key;
      }
    }
    return max;
  }
}
