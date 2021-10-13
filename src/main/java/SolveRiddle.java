public class SolveRiddle {

    public static void main(String[] args) {
        System.out.println(solution("??????????"));
    }
    public static String solution(String riddle) {
        // write your code in Java SE 8
        char[] myCharArray=riddle.toCharArray();
        int length=(int)riddle.length();
        //incase the first element is '?'
        if(myCharArray[0]=='?'){
            myCharArray[0]='a';
            //if secondelement is 'a' then firstelement becomes 'b'
            if(myCharArray[0]==myCharArray[1]){
                myCharArray[0]++;
            }
        }

        //Now traverse the charArray from 1 to length-1
        for (int i = 1; i < length-1; i++) {
            //check the current element is ?
            if(myCharArray[i]=='?'){
                myCharArray[i]='a';
                //cross check with previous character
                if(myCharArray[i]==myCharArray[i-1]){
                    myCharArray[i]++;
                }
                //cross check with next character
                if(myCharArray[i]==myCharArray[i+1]){
                    myCharArray[i]++;
                }
                //again cross check with previous character
                if(myCharArray[i]==myCharArray[i-1]){
                    myCharArray[i]++;
                }
            }
        }

        //cross check if last element is ?
        if(myCharArray[length-1]=='?'){
            myCharArray[length-1]='a';
            if(myCharArray[length-1]==myCharArray[length-2]){
                myCharArray[length-1]++;
            }
        }

        String result="";

        for (int i = 0; i < myCharArray.length; i++) {
            result+=myCharArray[i];
        }
        return result;
    }

}
