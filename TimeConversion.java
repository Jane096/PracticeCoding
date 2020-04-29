public class Solution {

    /*
     * Complete the timeConversion function below.
     */
    static String timeConversion(String s) {
        int time = Integer.parseInt(s.substring(0,2));

        if(s.endsWith("PM") && time < 12) {
            time += 12;
        }else if(s.endsWith("AM") && time == 12) {
            time -= 12;
        }
        return String.format("%02d", time) + s.substring(2,8);
    }
