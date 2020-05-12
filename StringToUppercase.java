class Solution {
    public String solution(String s) {
        String answer = "";
        Char ch = 0; //글자를 담을 변수
        int count = 0; //짝,홀을 구분할 변수 
        
        for(int i=0; i<s.length(); i++) {
            if(s.charAt(i) == ' ') { //공백이 있기때문에 공백처리 조건문
                ch = s.charAt(i);
                count=0;   
                
            }else {
                if(count % 2 == 0) {
                    ch = Character.toUpperCase(s.charAt(i));
                    count++;
                }else {
                    ch = Character.toUpperCase(s.charAt(i));
                    count++;
                }
            }
            answer += ch;
        }
        
        return answer;
    }
}
