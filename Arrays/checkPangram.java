package Arrays;
//Traversal method.
public class checkPangram {
    public static void main(String[] args) {
        String sentence ="1234";
        checkIfPangram(sentence);
    }

    static Boolean checkIfPangram(String sentence){
    Boolean allLetters = true;
    for(char ch='a';ch<='z';ch++){
        if(!sentence.contains(String.valueOf(ch))){
            allLetters=false;
            break;
        }
    }
    if(allLetters){
        System.out.println("It is a pangram string.");
    }else{
        System.out.println("It is not a pangram string.");
    }
    return allLetters;
    }
}
