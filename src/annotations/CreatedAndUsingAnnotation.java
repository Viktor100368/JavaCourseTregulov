package annotations;

import java.lang.annotation.*;

public class CreatedAndUsingAnnotation {
    public static void main(String[] args) throws ClassNotFoundException {
        Class xiaomiClass = Class.forName("annotations.Xiaomi");
        Annotation annotation1 =xiaomiClass.getAnnotation(SmartPhone.class);
        SmartPhone smp = (SmartPhone) annotation1;
        System.out.println("annotation Xiaomi "+smp.OS()+" , "+smp.yearOfCompanyCreation());
        
        Class iphoneClass = Class.forName("annotations.Iphone");
        Annotation annotation2 = iphoneClass.getAnnotation(SmartPhone.class);
        smp=(SmartPhone) annotation2;
        System.out.println("annotation Iphone "+smp.OS()+" ; "+ smp.yearOfCompanyCreation());
    }
}


@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@interface SmartPhone {
    String OS() default "Android";
    int yearOfCompanyCreation() default 2010;
}
@SmartPhone //значение заданное по дефолту, указывать не обязательно
class Xiaomi{
    String model;
    double price;
}
@SmartPhone(OS = "IOS",yearOfCompanyCreation = 1976)
class Iphone {
    String model;
    double price;
}
