class Solution {

    public int nearestValidPoint(int x, int y, int[][] points) {
        int leftMostIndex = -1;
        int minMHD = Integer.MAX_VALUE;
        for (int i = 0; i < points.length; i++) {
            if (x == points[i][0] || y == points[i][1]) {
                if (minMHD > (Math.abs(x - points[i][0]) + Math.abs(y - points[i][1]))) {
                    minMHD = Math.abs(x - points[i][0]) + Math.abs(y - points[i][1]);
                    leftMostIndex = i;
                }
            }
        }
        return leftMostIndex;
    }
}
