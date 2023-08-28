class Solution {
    public int Firstnn(int n) {

        return n * (n + 1) / 2;

    }

    public static void main(String args[]) {
        Solution s = new Solution();
        int result = s.Firstnn(5);
        System.out.println(result);
    }
}