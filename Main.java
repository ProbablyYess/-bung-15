/**
 * Main-Methode zum Starten des Programmes
 */


public class Main {
    public static void main(String[] args){
        String str = new String("OrtO");
        PalindromeChecker palindromeChecker = new PalindromeChecker(str);
        palindromeChecker.checkIsPalindrome();
    }
}

/**
 * Klasse zum Auswerten eines Palindroms
 */
class PalindromeChecker{
    private String str;
    
    public PalindromeChecker(String str){
        this.str = str;
    }

    public String getString(){
        return this.str;
    }

    public void setString(String str){
        this.str = str;
    }

    public boolean checkIsPalindrome(){
        //return  this.checkIsPalindromeIterative();
        return  this.checkIsPalindromeRecursive(this.str);
    }

    /**
     * Iterative Variante
     */
    private boolean checkIsPalindromeIterative(){
        int len = this.str.length() / 2; //abgerundetes Ergebnis
        for(int i = 0; i < len; i++){
            if(this.str.charAt(i) != this.str.charAt(this.str.length() - 1 - i)){
                return false;
            }
        }
        return  true;

    }

    /**
     * Rekursive Variante
     */
    private boolean checkIsPalindromeRecursive(String palindrome){
        if(palindrome.length() < 2){
            return true;
        }
        else if(palindrome.charAt(0) != palindrome.charAt(palindrome.length() - 1)){
            return false;
        }
        return checkIsPalindromeRecursive(palindrome.substring(1, palindrome.length() - 1));
    }

}