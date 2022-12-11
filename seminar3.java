import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class seminar3 {
    
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
        // for(int i=0; i<colors.size(); i++){
        //     colors[i]= 5;
        // }
    }
}
    // 3 Вставить элемент в список в первой позиции.
    // 4 Извлечь элемент (по указанному индексу) из заданного списка.
    // 5 Обновить определенный элемент списка по заданному индексу.
    // 6 Удалить третий элемент из списка.
    // 7 Поиска элемента в списке по строке.
    // 8 Создать новый список и добавить в него несколько елементов первого списка.
    // 9 Удалить из первого списка все элементы отсутствующие во втором списке.
    // *10 Сортировка списка.
    // *11 Сравнить время работы тысячи повторений пункта 3 для ArrayList и LinkedList.


