import java.io.*;
/**
 * Write a description of class Palindrom here.
 *
 * @author Hartmann
 * @version (a version number or a date)
 */
public class Palindrom{
    
    public static boolean iterativ (String wort){
        int vorn=0;
        int hinten=wort.length()-1;
        while (vorn < hinten){
            if (wort.charAt(vorn) == wort.charAt(hinten)){
                vorn++;
                hinten--;
            }
            else return false;
        }
        return true;
    }
    
    public static boolean rekursiv (String wort){
        return rek(wort,0,wort.length()-1);
    }
    
    private static boolean rek (String wort, int vorn, int hinten){
        if (vorn >= hinten){
            return true;
        }
        if (wort.charAt(vorn) == wort.charAt(hinten)){
                return rek(wort, vorn+1, hinten-1);
            }
        else return false;
    }
}