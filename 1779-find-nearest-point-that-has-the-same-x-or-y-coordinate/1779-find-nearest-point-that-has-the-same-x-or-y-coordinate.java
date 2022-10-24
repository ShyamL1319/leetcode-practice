class Solution {

    public int nearestValidPoint(int x, int y, int[][] points) {
        int leftMostIndex = -1;
        int minMHD = Integer.MAX_VALUE;
        for (int i = 0; i < points.length; i++) {
            int x1 = points[i][0];
            int y1 = points[i][1];
            if (x == x1 || y == y1 ) {
                int currDist = Math.abs(x - x1) + Math.abs(y - y1);
                if (minMHD > currDist) {
                    minMHD = currDist;
                    leftMostIndex = i;
                }
            }
        }
        return leftMostIndex;
    }
}
