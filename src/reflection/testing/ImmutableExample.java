package reflection.testing;

import java.lang.reflect.Field;

// сделаем этот класс финальным, чтобы никто не мог его изменить
public final class ImmutableExample {
//    String name = "Vasja";

    private String address;
    private  int size = 1000;

    ImmutableExample (String address) {
        this.address = address;
    }

    public String getAddress() {
        return address +" value = "+size;
    }

    //удаляем сеттер

    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {

        ImmutableExample obj = new ImmutableExample("old address");
        System.out.println(obj.getAddress());
        System.out.println("==================================");

        // Поэтому никак не изменить это поле, значит это immutable объект
        // obj.setName("new address");
        // System.out.println(obj.getName());
        Class imClass = obj.getClass();

//        Field privateField = imClass.getDeclaredField("size");
//        privateField.setAccessible(true);
//        int value =  privateField.getInt(obj);
//        System.out.println("value = "+value);
//        privateField.set(obj,50000);
//        value =  privateField.getInt(obj);
//        System.out.println("value = "+value);
        int intValue = 0;
        String nameField ="";
        Field[] privateFields = imClass.getDeclaredFields();
        for(Field f: privateFields){
            //f.setAccessible(true);
            if(f.getName()=="size") {
                intValue = f.getInt(obj);
            }
            else {
                nameField = f.getName();
            }
        }
        System.out.println("intValue = "+intValue+" nameField = "+ nameField);
        Field iValue = imClass.getDeclaredField("size");
        Field sValue = imClass.getDeclaredField("address");
       // iValue.setAccessible(true);
        iValue.set(obj,560000);
        sValue.set(obj,"new Addres");

        System.out.println("==================");
        System.out.println(obj.getAddress());

    }
}
