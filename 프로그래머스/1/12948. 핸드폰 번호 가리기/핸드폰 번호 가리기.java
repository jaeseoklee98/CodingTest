class Solution {
    public String solution(String phone_number) {
        String answer = "";
        
        String back = phone_number.substring(phone_number.length()-4);
        
        for(int i=0; i<phone_number.length()-4; i++){
            answer += '*';
        }
        
        answer += back;
        return answer;
    }
}