class Solution {
  public int maxAreaOfIsland(int[][] grid) {
    int maxArea = 0;
    int m = grid.length, n = grid[0].length;
    for(int i = 0; i < m; i++) {
      for(int j = 0; j < n; j++) {
        maxArea = Math.max(maxArea, getArea(grid, i, j));
      }
    }
    return maxArea;
  }

  private int getArea(int[][] grid, int i, int j) {
    if(i < 0 || i >= grid.length || j < 0 || j >= grid[0].length || grid[i][j] == 0) {
      return 0;
    }
    grid[i][j] = 0;
    return 1 + getArea(grid, i - 1, j) + getArea(grid, i + 1, j) + getArea(grid, i, j - 1) + getArea(grid, i, j + 1);
  }
}
