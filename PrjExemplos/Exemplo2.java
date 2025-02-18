
/**

 * @author Murilo Fekete
 */
public class Exemplo2 {
    public static void main(String arg[]) {
        int x;
        
        x = (int) (Math.random()*100);
        
        if (x < 50) {
            System.out.println("O valor " + x + " é menor que 50");
          
        } else {
            System.out.println("O valor " + x + " é maior que 50");
        }
    }
}
