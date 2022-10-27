class Solution {
    public boolean checkStraightLine(int[][] coordinates) {
        // double m = (coordinates[1][1] - coordinates[0][1])/((coordinates[1][0]-coordinates[0][0]) * 1.0);
        // int n = coordinates.length;
        // for(int i=2; i<n; i++){
        //     double m2 = ((coordinates[i][1] - coordinates[i-1][1])/((coordinates[i][0]-coordinates[i-1][0]) * 1.0));
        //     if(m != m2 && coordinates[i][0] != 0 && coordinates[i-1][0] != 0) return false;
        // }
        // return true;
        int x0 = coordinates[0][0], y0 = coordinates[0][1], 
        x1 = coordinates[1][0], y1 = coordinates[1][1];
        int dx = x1 - x0, dy = y1 - y0;
        for (int[] co : coordinates) {
            int x = co[0], y = co[1];
            if (dx * (y - y1) != dy * (x - x1))
                return false;
        }
        return true;
    }
}