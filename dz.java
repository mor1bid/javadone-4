/**
 * dz
 */
import java.util.*;
import java.util.concurrent.ThreadLocalRandom;
public class dz {
    public static void main(String[] args) {
        Scanner work = new Scanner(System.in);
        System.out.print("1. Введине желаемый размер массива: ");
        String amo = work.nextLine();
        int unt = Integer.parseInt(amo); 
        LinkedList<Integer> lili = new LinkedList<>();
        Deque<Integer> que = new LinkedList<>();
        for (int i = 0; i<=unt; i++) 
        {
            int ranum = ThreadLocalRandom.current().nextInt(0, 10);
            lili.add(ranum);
            que.add(ranum);
        }
        System.out.println(Arrays.asList(lili));
        for (int i = 0, j = unt; i<unt/2; i++, j--) {
            int newi = lili.get(j);
            int oldi = lili.get(i);
            lili.set(i, newi);
            lili.set(j, oldi);
        }
        System.out.println(Arrays.asList(lili));

        int del = que.peek();
        que.poll();
        System.out.println("2.\n" + Arrays.asList(que));
        
        que.addFirst(del);
        System.out.println(que.peek());


        work.close(); 
    }

        // static int enqueue(int ele) {
        //     for (int i = 0; i<unt; i++) {

        //     return ele;
        //     }
        // }
}