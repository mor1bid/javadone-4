/**
 * dz
 */
import java.util.*;
import java.util.concurrent.ThreadLocalRandom;
public class dz {
    public static void main(String[] args) {
        Scanner work = new Scanner(System.in);
        String amo = work.nextLine();
        int unt = Integer.parseInt(amo); 
        LinkedList<Integer> lili = new LinkedList<>();
        for (int i = 0; i<unt; i++) 
        {
            int ranum = ThreadLocalRandom.current().nextInt(0, 10);
            lili.add(ranum);
        }
        System.out.println(Arrays.asList(lili));
        for (int i = 0, j = unt; i<unt/2; i++, j--) {
            lili.set(i, j);
        }
        System.out.println(Arrays.asList(lili));
        work.close();
    }
}