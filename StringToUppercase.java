class Solution {
    public String solution(String s) {
        String answer = "";
        String[] arr = s.split("");//굳이 toCharArray 사용할 필요는 없을 듯(코드가 복잡해짐)
        int count = 0; //짝,홀을 구분할 변수 
        
        for(int i=0; i<arr.length; i++) {
            if(s.equals("")) {
                count=0;
                continue;//공백이 있기때문에 공백처리 조건문
            }
            if(count % 2 ==0) {
                arr[i] = arr[i].toUpperCase();
                count++;
                
            }else {
                arr[i] = arr[i].toLowerCase();
                count++;
            }
            answer += arr[i];
        }
        
        return answer;
    }
}
