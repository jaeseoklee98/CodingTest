class Solution {
    public boolean solution(int x) {
        boolean answer = true;
        String add = Integer.toString(x);
        int hap = 0;
        for(int i = 0; i<add.length(); i++){
            hap += add.charAt(i) - 48;
        }
        
        if(x%hap == 0){
            answer=true;
        }else{
            answer=false;
        }
        return answer;
    }
}