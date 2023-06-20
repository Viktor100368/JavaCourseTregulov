package list.listIterator;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class Test1 {
    public static void main(String[] args) {
        String s = "madam";
        List<Character> list = new LinkedList<>();
        for(char el:s.toCharArray()){
            list.add(el);
        }
        ListIterator iterator = list.listIterator();
        ListIterator reverseIterator = list.listIterator(list.size());
        boolean isPalindrom = true;
        while(iterator.hasNext() && reverseIterator.hasPrevious()){
            if(!(iterator.next().equals(reverseIterator.previous()))){
                isPalindrom = false;
                break;
            }
        }
        if(isPalindrom){
            System.out.println("Заданное слово является палиндромом");
        }else{
            System.out.println("Заданное слово не является палиндромом");
        }
    }
}
