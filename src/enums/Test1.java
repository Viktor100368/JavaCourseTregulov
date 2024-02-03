package enums;

public class Test1 {
    public static void main(String[] args) {
        for(WeekDays w:WeekDays.values()){
             new Today(w).info(w);
        }
        System.out.println("====================");
        enum Name{
            Ivan,
            Anna,
            Petr,
            Marija;
        };
      for(Name n: Name.values()){
          System.out.println(n);
      }


    }
}
enum WeekDays{
    ПОНЕДЕЛЬНИК, ВТОРНИК, СРЕДА, ЧЕТВЕРГ, ПЯТНИЦА, СУББОТА, ВОСКРЕСЕНЬЕ;
}
class Today{
    private WeekDays weekDay;
    Today(WeekDays weekDay){
        this.weekDay = weekDay;
    }
    public void info(WeekDays weekDay){
        switch (weekDay){
            case ПОНЕДЕЛЬНИК :
            case ВТОРНИК:
            case СРЕДА:
            case ЧЕТВЕРГ:
            case ПЯТНИЦА:
                System.out.println(weekDay+ " иди на работу");
                break;
            case СУББОТА:
            case ВОСКРЕСЕНЬЕ:
                System.out.println(weekDay+ " сиди дома, отдыхай");
        }
    }

    public WeekDays getWeekDay() {
        return weekDay;
    }
}