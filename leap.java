import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner d=new Scanner(System.in);
        int yr=d.nextInt();
        if((yr%400==0)||(yr%4==0&&yr%100!=0))
        {
            System.out.println(yr+" is a leap year");
        }
        else
        {
            System.out.println(yr+" is not a leap year");
        }
    }
}
