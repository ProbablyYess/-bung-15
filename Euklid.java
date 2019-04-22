/**
 * Ermitteln des größten gemeinsamen Teilers zweier Zahlen
 * mit Hilfe des euklidischen Algorithmusses
 * 
 * @author Abbas, Maaß
 */
public class Euklid{
    public static int ggT(int a, int b) {
        if (b==0) {
            return a;
            
        }
        return ggT(b, a % b);
    }
}