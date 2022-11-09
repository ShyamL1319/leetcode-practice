class Solution {
    public boolean isValidSudoku(char[][] board) {
        HashSet<Character> rowSet = new HashSet<>();
        HashSet<Character> colSet = new HashSet<>();
        int flag = 1;
        //check all row has any duplicate
        for(int i=0; i<9; i++){
            colSet = new HashSet<>();
            rowSet = new HashSet<>();
            for(int j=0; j<9; j++){
                if(colSet.contains(board[i][j]) || rowSet.contains(board[j][i])){
                    flag=0;
                    break;
                }else{
                    if(board[i][j] != '.')
                        colSet.add(board[i][j]);
                    if(board[j][i] != '.')
                        rowSet.add(board[j][i]);
                }
            }
            if(flag==0) break;
        }
        
        if(flag==0) return false;
        
        // check 3*3
        return (check3X3(board,0) && check3X3(board,3) && check3X3(board,6));
    }
    
    public boolean check3X3(char[][] board, int col){
        int k = 0;
        HashSet<Character> set = new HashSet<>();
        int flag = 1;
        while(k<9){
            set = new HashSet<>();
            for(int i=0; i<3; i++){
                for(int j=0; j<3; j++){
                    if(set.contains(board[i+k][j+col])){
                        flag=0;
                        break;
                    }else{
                        if(board[i+k][j+col] != '.')
                            set.add(board[i+k][j+col]);
                    }
                }
                if(flag==0) break;
            }
            k+=3;
            if(flag==0) break;
        }
        if(flag == 0) return false;
        else return true;
    }
}