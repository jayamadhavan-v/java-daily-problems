package problems.basic;

import Tool.Tools;

///  https://www.geeksforgeeks.org/problems/find-last-digit-of-ab-for-large-numbers1936/1
// day 2

public class GetLastDigit {
    public static void main(String[] args) {
        int output = getLastDigit("3","10");
        System.out.println(output);
    }
    static int getLastDigit(String a , String b){
        Tools t = new Tools();
        int base  =  t.StringToInteger(a);

         int power = t.StringToInteger(b);

         int result = (int) (Math.pow(base , power));
         return result % 10 ;
    }
}
