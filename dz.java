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
        for (int i = 0; i<=unt; i++) 
        {
            int ranum = ThreadLocalRandom.current().nextInt(0, 10);
            lili.add(ranum);
        }
        System.out.println(Arrays.asList(lili));
        for (int i = 0, j = unt; i<unt/2; i++, j--) {
            int newi = lili.get(j);
            int oldi = lili.get(i);
            lili.set(i, newi);
            lili.set(j, oldi);
        }
        System.out.println(Arrays.asList(lili));

        System.out.println("2.");
        enqueue(lili);
        System.out.println();
        dequeue(lili);
        System.out.println();
        first(lili);

        Stack<Integer> cats = new Stack<>();
        boolean calc = true;
        String arga = "";
        double res = 0;
        System.out.println("\n3. Калькулятор! \nДоступные арифметические действия: сложение (+), вычитание (-), умножение (*), деление (/) \nВведите первый аргумент: ");
        while (calc)
        {
            if ( arga.equals("")) { arga = work.nextLine(); }
		    double numa = 0, numb = 0;
		    if (arga.chars().allMatch(Character::isDigit)) { numa = Double.parseDouble(arga); }
		    else System.out.println("Заданный аргумент не является числом!");
            System.out.println("Укажите желаемое действие: ");
		    String opera = work.nextLine();
		    System.out.println("Введите второй аргумент: ");
		    String argb = work.nextLine();
		    if (arga.chars().allMatch(Character::isDigit)) { numb = Double.parseDouble(argb); }
		    else System.out.println("Заданный аргумент не является числом!");

		    if (opera.equals("+")) { res = numa + numb; System.out.println("Ответ: " + res); }
		    else if (opera.equals("-")) { res = numa - numb; System.out.println("Ответ: " + res); }
		    else if (opera.equals("*")) { res = numa * numb; System.out.println("Ответ: " + res); }
		    else if (opera.equals("/") && numb != 0) { res = numa / numb; System.out.println("Ответ: " + res); }
		    else System.out.println("Ошибка!");
            int mouse = (int) res;
            cats.push(mouse);

            System.out.println("Новая операция? y/n");
            String yn = work.nextLine();
            if (yn.equals("y")) 
            {
                boolean var = true;
                while (var)
                {
                    System.out.println("Использовать предыдущую операцию?: \n(1) Да;\n(2) Нет;\n(3) Удалить предыдущую операцию" + " (" + cats.peek() + ")");
                    String chs = work.nextLine();
                    if (chs.equals("1")) {
                        String yes = String.valueOf(cats.peek()); 
                        arga = yes; 
                        var = false; 
                    }
                    if (chs.equals("2")) {arga = "";}
                    if (chs.equals("3")) {cats.pop();}
                }
            }
            else if (yn.equals( "n")) 
            {
                calc = false;
            }
        }
        work.close(); 
    }

        static LinkedList<Integer> enqueue(LinkedList<Integer> li) {
            li.offer(li.get(0));
            li.remove(0);
            System.out.println(Arrays.asList(li));
            return li;
        }
        static LinkedList<Integer> dequeue(LinkedList<Integer> li) {
            System.out.println(li.get(0));
            li.remove(0);
            System.out.println(Arrays.asList(li));
            return li;
        }
        static LinkedList<Integer> first(LinkedList<Integer> li) {
            System.out.println(li.get(0));
            System.out.println(Arrays.asList(li));
            return li;
        }
}