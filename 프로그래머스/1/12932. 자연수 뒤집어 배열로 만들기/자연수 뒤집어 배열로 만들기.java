class Solution {
    public int[] solution(long n) {
        int[] answer = {};
        int c=0;
        long num = n;
        
        while(n>0){
            c++;
            n=n/10;
        }
        
        answer = new int[c];
        
        for(int i=0; i<c; i++){
            answer[i] = (int)(num%10);
            num = num/10;
        }
        return answer;
    }
}