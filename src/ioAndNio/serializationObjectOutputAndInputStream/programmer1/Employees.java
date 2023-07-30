package ioAndNio.serializationObjectOutputAndInputStream.programmer1;

import java.io.Serializable;

public class Employees implements Serializable {
    //чтобы объект мог сериализовываться, он должен имплементировать интерфейс serializable
    //хорошая практика в указании serialVersionUID, т.к. дефолтный UID , очень чуствительный к данным
    // и при различных компиляторах чреаато выбрасыванием exceptions
    static final long serialVersionUID = 2;
    private String name;
    private String userName;
    private int age;
    private transient int salary;//Если не нужно передавать, к примеру salary, то указываем
    //ключевое слово transient и тогда при сериализации данное поле не будет сериализовываться
    Car car;

    public Employees(String name, String userName, int age, int salary,Car car) {
        this.name = name;
        this.userName = userName;
        this.age = age;
        this.salary = salary;
        this.car = car;
    }

    @Override
    public String toString() {
        return "Employees{" +
                "name='" + name + '\'' +
                ", userName='" + userName + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                ", car=" + car +
                '}';
    }
}
