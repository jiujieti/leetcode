public class Solution {
  public List<TreeNode> generateTrees(int n) {
    if(n == 0) {
      return new ArrayList<TreeNode>();
    }
    return generateTrees(1, n);
  }

  private List<TreeNode> generateTrees(int start, int end) {
    List<TreeNode> res = new ArrayList<>();
    if(start > end) {
      res.add(null);
      return res;
    }
    for(int i = start; i <= end; i++) {
      List<TreeNode> leftTrees =  generateTrees(start, i-1);
      List<TreeNode> rightTrees = generateTrees(i+1, end);
      for(TreeNode leftTree : leftTrees) {
        for(TreeNode rightTree: rightTrees) {
          TreeNode root = new TreeNode(i);
          root.left = leftTree;
          root.right = rightTree;
          res.add(root);
        }
      }
    }
    return res;
  }
}
