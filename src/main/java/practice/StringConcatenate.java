package practice;

import java.lang.reflect.Array;
import java.util.*;

public class StringConcatenate {
    String ConcatenatedString;
    String stringConcatenate(String string1,String string2){
        //ConcatenatedString = string1+string2;
        ConcatenatedString = string1.concat(string2);
        return ConcatenatedString;
    }
    void findInitials(char[] fullName){

        for(char i:fullName) {
            if(Character.isUpperCase(i))
                System.out.print(" ");
            System.out.print(i);
        }
    }
    boolean isAnagram(String s1, String s2) {
        String[] string1 = s1.split("");
        String[] string2 = s2.split("");
        for(String i:string1){
            if(!Arrays.asList(string2).contains(i))
                return false;
        }
        return true;
    }
    public static void main(String[] args) {
        StringConcatenate obj1= new StringConcatenate();
        Scanner input = new Scanner(System.in);
        System.out.println("Enter two strings:");
        String s1 = input.nextLine();
        String s2 = input.nextLine();
        //System.out.println(obj1.stringConcatenate(strings[0],strings[1]));
        //System.out.println("Enter name:");
        //obj1.findInitials(input.nextLine().toCharArray());
        System.out.println(obj1.isAnagram(s1,s2));
    }
}
