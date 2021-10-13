public class Anagram {
    public static void main(String[] args) {
        String str="aabbaa1";
        boolean isAnagram=anagram(str);
        System.out.println("The given string is anagram? "+isAnagram);
        System.out.println(reverseString(str));
    }

    private static String reverseString(String str) {
        char temp;
        char[] myCharArray=str.toCharArray();
        //using 2 pointer algorithm
        for (int i = 0; i < myCharArray.length/2; i++) {
            temp=myCharArray[i];
            myCharArray[i]=myCharArray[myCharArray.length-1-i];
            myCharArray[myCharArray.length-1-i]=temp;
        }
        String result="";
        for (int i = 0; i < myCharArray.length; i++) {
            result+= myCharArray[i];
        }
        return result;
    }

    private static boolean anagram(String str) {
        char[] myCharArray=str.toCharArray();
        for (int i = 0; i < myCharArray.length/2; i++) {
            if(myCharArray[i]==myCharArray[myCharArray.length-1-i])
                continue;
            else
                return false;
        }
        return true;
    }
}
