class Solution {
    public boolean checkStraightLine(int[][] coordinates) {
        double m = (coordinates[1][1] - coordinates[0][1])/((coordinates[1][0]-coordinates[0][0]) * 1.0);
        int n = coordinates.length;
        for(int i=2; i<n; i++){
            double m2 = ((coordinates[i][1] - coordinates[i-1][1])/((coordinates[i][0]-coordinates[i-1][0]) * 1.0));
            if(m != m2 && coordinates[i][0] != 0 && coordinates[i-1][0] != 0) return false;
        }
        return true;
    }
}