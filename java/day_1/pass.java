class Solution {
    public int passThePillow(int n, int time) {
      return n-- - Math.abs(n - time % (n * 2));
    }
}