class Solution {
    public int solution(int[] numbers) {
        int answer = 0;
        int add = 0;
        
        for(int i=0; i < numbers.length; i++){
            add += numbers[i];
            answer = 45-add;    
        }
        return answer;
    }
}