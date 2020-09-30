/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datereverse;

import java.util.Arrays;

/**
 *
 * @author Justas
 */
public class DateReverse {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
           ReverseDates(2010,2015);          
    }
    
     public static void ReverseDates(int from, int to)
    {
        char[] before;
        char[] after;
        
        int[] days = {31,28,31,30,31,30,31,31,30,31,30,31};
        for(int i=from; i<to; i++)
        {
            if(IsLeapYear(i))
                days[1]=29;
            else
                days[1]=28;
            
            for(int j=1; j<12; j++)
            {
                for(int o=1; o<days[j]; o++)
                {
                    
                    before = (i + "" + j+ "" + o).toCharArray();
                    after =  ReverseChar(before);
                    if(Arrays.equals(before, ReverseChar(after)))
                        System.out.println(i+"-"+j+"-"+o);
                }
            }
        }
    }
    private static char[] ReverseChar(char [] before)
    {
        char[] after = new char[before.length];
        int j =0;
        for (int i = before.length-1; i >= 0 ; i--)
        {
            after[j] = before[i];
            j++;
        }
        return after;
    }
    private static boolean IsLeapYear(int year)
    {  
        if((year % 4 == 0 && year % 100 !=0) || year % 400 == 0)
            return true;
            return false;
    }
}
