import java.io.*;
/**
 * Write a description of class Speedtest here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Speedtest{
    
   private final static String [] TESTWOERTER = {"a","aa","aaa","aaaa","aaaaa","aaaaaa","aaaaaaa","aaaaaaaa"};
    
   public static void main (String [] args){
      try{
          double [] iterativ = new double [TESTWOERTER.length];
          double [] rekursiv = new double [TESTWOERTER.length];
          for (int i=0;i<TESTWOERTER.length;i++){
              iterativ[i] = testIterativ(TESTWOERTER[i]);
              rekursiv[i] = testRekursiv(TESTWOERTER[i]);
            }
          BufferedWriter ein = new BufferedWriter(new FileWriter("Messwerte.txt"));
          write(iterativ, ein);
          write(rekursiv, ein);
          ein.close(); 
      }
      catch (Exception e){
          System.out.println(e);
        }
   }
    
   private static double testIterativ (String testwort){
        double t1;
        double t2;
        t1 = System.nanoTime();
        Palindrom.iterativ(testwort);
        t2 = System.nanoTime();        
        return t2-t1;
    }
    
    private static void write (double [] t, BufferedWriter ein) throws java.io.FileNotFoundException,java.io.IOException{        
        ein.newLine();
        for (double a:t){
            ein.write((a) + ", ");
        }       
        
    }
    
    private static double testRekursiv (String testwort){
        double t1;
        double t2;
        t1 = System.nanoTime();
        Palindrom.rekursiv(testwort);
        t2 = System.nanoTime();        
        return t2-t1;
    }
}
