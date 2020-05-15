class Solution {
    public int solution(String dartResult) {
        int[] answer = new int[3];
        int index = 0, count = 0;
        
        for(int i=0; i<dartResult.length(); i++) {
            char dar_char = dartResult.charAt(i);
            int dartInt = Character.getNumericValue(dar_char); //문자 순서대로 가져옴(unicode방식)
            
            if(dartInt >= 0 && dartInt <= 10) { //한글자씩 가져올 때 10의 경우 주의
                if(dartInt == 1) {
                    if(Character.getNumericValue(dartResult.charAt(i+1)) == 0) {
                        dartInt = 10;
                        i++;
                    }
                }
                answer[index] = dartInt;
                count++;
                
            }else {
                switch(dar_char) {
                    case 'S':
                        answer[index] = (int) Math.pow(answer[index], 1);
                        index++;
                        break;
                    case 'D':
                        answer[index] = (int) Math.pow(answer[index], 2);
                        index++;
                        break;
                    case 'T':
                        answer[index] = (int) Math.pow(answer[index], 3);
                        index++;
                        break;
                    case '*':
                        index = index - 2 < 0 ? 0 : index - 2;//최근 2개 점수에 x2
                        while(index < count) { //index -2한 값만큼 반복문
                            answer[index] = answer[index] * 2;
                            index++;
                        }
                        break;
                    case '#':
                        answer[index-1] = answer[index-1] * (-1); //이전 인덱스에서 -1
                        break;
                }
            }
        }
        
        return answer[0] + answer[1] + answer[2];
    }
}
