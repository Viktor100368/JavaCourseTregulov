package nestedClasses.anonymusInnerClass;

/**
 * Anonimous класс не имеет имени
 * Anonimous класс - это "объявление" класса и одновременное создание объекта
 * В анонимных классах невозможно написать конструктор
 * Анонимный класс ьожет оброщаться даже к private элементам внешнего класса
 * Lambda expressions - это краткая форма для написания анонимных классов
 */
public class AnonymusClassDemo {
    public static void main(String[] args) {

        Math math = new Math() {
            @Override
            public int doOperation(int a, int b) {
                return a + b;
            }
        };
        System.out.println("result = "+math.doOperation(5,3));
    }
}
interface Math{
    int doOperation(int a,int b);
}
