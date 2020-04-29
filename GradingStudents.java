class Result {

    /*
     * Complete the 'gradingStudents' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts INTEGER_ARRAY grades as parameter.
     */

    public static List<Integer> gradingStudents(List<Integer> grades) {
        List<Integer> answer = new ArrayList<Integer>();

        for(int i=0; i<grades.size(); i++) {
            if(grades.get(i) < 38){
                answer.add(grades.get(i));
            }else if(grades.get(i)%10 == 0){
                answer.add(grades.get(i));
            }else if(grades.get(i) % 5 >= 3) {
                answer.add(grades.get(i)+(5-(grades.get(i)%5)));
            }else{
                answer.add(grades.get(i));
            }
        }
        
        return answer;
    }
}
