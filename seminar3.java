import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.ListIterator;

public class seminar3 {
    
    /**
     * @param args
     */
    public static void main(String[] args) {
// 1 Создать новый список, добавить несколько строк и вывести коллекцию на экран.
        ArrayList<String> colors = new ArrayList<>();
        colors.add("Red");
        colors.add("Yellow");
        colors.add("Cean");
        colors.add("Magenta");
        colors.add("Black");
        System.out.println(colors);
// 2 Итерация всех элементов списка цветов и добавления к каждому символа '!'.
        ListIterator<String> listiter = colors.listIterator();
        while(listiter.hasNext()){
            listiter.set(listiter.next()+"!");
        } 
        System.out.println(colors);
// 3 Вставить элемент в список в первой позиции.
        colors.add(0,"Green");
        System.out.println(colors);
// 4 Извлечь элемент (по указанному индексу) из заданного списка.
        System.out.println(colors.get(2));
// 5 Обновить определенный элемент списка по заданному индексу.
        colors.set(1,"Purpur");
        System.out.println(colors);
// 6 Удалить третий элемент из списка.
        colors.remove(2);
        System.out.println(colors);
// 7 Поиска элемента в списке по строке.
        System.out.println(colors.contains("Green"));
// 8 Создать новый список и добавить в него несколько елементов первого списка.
        ArrayList<String> flora = new ArrayList<>();
        flora.add(0,colors.get(0));
        flora.add(1,colors.get(3));
        flora.add(2,colors.get(2));
        System.out.println(flora);
// 9 Удалить из первого списка все элементы отсутствующие во втором списке.

        for(int i=0; i<colors.size(); i++){
            if(flora.contains(colors.get(i)));
                colors.remove(i);
        }
        System.out.println(colors);
        // *10 Сортировка списка.
        Collections.sort(flora);
        System.out.println(flora);
// *11 Сравнить время работы тысячи повторений пункта 3 для ArrayList и LinkedList.
        
        System.out.println(Collections.nCopies(100, colors));
    }
}


