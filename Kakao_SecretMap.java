class Solution { //Or 연산자 사용해서 1은 #, 0은 공백처리
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];
        
        for(int i=0; i<n; i++) {
            String temp = Integer.toBinaryString(arr1[i] | arr2[i]); //2진수 변환
            temp = String.format("%"+n+"s", temp); //String 해당 자릿수를 맞추는 경우 
            temp = temp.replaceAll("1", "#");
            temp = temp.replaceAll("0", " ");//' '넣으면 char형으로 인식-error!!
            answer[i] = temp;   
        }
        return answer;
    }
}
