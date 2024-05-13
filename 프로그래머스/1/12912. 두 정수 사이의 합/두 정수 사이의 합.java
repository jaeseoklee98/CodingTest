class Solution {
    public long solution(long a, long b) {
        long answer = 0;
        if(a == b){
            answer = (long)a;
            return answer;
        }else if(a < b){
            for(long i=0; i<=b-a; i++){
                answer += b - i;
            }
        }else{
            for(long i=0; i<=a-b; i++){
                answer += a-i;
            }
        }
        return answer;
    }
}