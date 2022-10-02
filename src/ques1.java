interface findGreater{
    boolean isGreater(int num1,int num2);
}
interface incrementNumber{
    int increment(int num);
}
interface concatStrings{
    String concatenation(String str1, String str2);
}
interface upperCaseStrings{
    String upperCase(String string);
}
public class ques1 {
    public static void main(String[] args) {
        findGreater greater= (int num1, int num2) -> {if(num1>num2) return true; else return false;};
        System.out.println(greater.isGreater(7,5));
        incrementNumber increment= (int num) -> (num+1);
        System.out.println(increment.increment(7));
        concatStrings concat= (String str1, String str2)-> (str1.concat(str2));
        System.out.println(concat.concatenation("Harsh","Gupta"));
        upperCaseStrings upperCase=(String string)->(string.toUpperCase());
        System.out.println(upperCase.upperCase("Harsh"));
    }
}