public class Solution {
  public int divide(int dividend, int divisor) {
    if(divisor == 0) {
      return Integer.MAX_VALUE;
    }
    int sign = 1;
    if((dividend < 0 && divisor > 0) || (dividend > 0 && divisor < 0)) {
      sign = -1;
    }
  }
}
