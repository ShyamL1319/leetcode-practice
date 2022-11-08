class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result  = new ArrayList<>();
        
        List<Integer> list = new ArrayList<>();
        list.add(1);
        result.add(list);
        for(int i = 1; i<numRows; i++){
            list = new ArrayList<>();
            list.add(1);
            for(int j = 1; j<i; j++){
                list.add(result.get(i-1).get(j-1) + result.get(i-1).get(j));
            }
            list.add(1);
            result.add(list);
            //System.out.println(result);
        }
        return result;
    }
}