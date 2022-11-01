class Solution {
    public String interpret(String command) {
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<command.length(); i++){
            if(command.charAt(i) == 'G'){
                //res+="G";
                sb.append("G");
            }else if(command.charAt(i) == '(' && command.charAt(i+1) == ')'){
                //res += "o";
                sb.append("o");
                i+=1;
            }else{
                //res+="al";
                sb.append("al");
                i+=3;
            }
        }
        //System.out.print(res);
        return sb.toString();
    }
}