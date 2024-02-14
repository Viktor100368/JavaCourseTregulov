package anna_task.day2;

import java.time.LocalDate;
import java.util.Map;
import java.util.TreeMap;

public class HolidaysSchedule {
   private Map<LocalDate,String> holidays;

    public HolidaysSchedule(Map<LocalDate, String> holidays) {
        this.holidays = holidays;
    }
    public void showSchedule(){
        for(Map.Entry<LocalDate,String> map:holidays.entrySet()){
           LocalDate key= map.getKey();
           String str = map.getValue();
            System.out.printf("%d  - %s  it is %s\n",key.getDayOfMonth(),key.getMonth(),str);
        }
    }

    public static void main(String[] args) {
        Map<LocalDate,String> holiday = new TreeMap<>();
        holiday.put(LocalDate.of(2024,1,1),"Ноаогодние каникулы");
        holiday.put(LocalDate.of(2024,1,2),"Ноаогодние каникулы");
        holiday.put(LocalDate.of(2024,1,3),"Ноаогодние каникулы");
        holiday.put(LocalDate.of(2024,1,4),"Ноаогодние каникулы");
        holiday.put(LocalDate.of(2024,1,5),"Ноаогодние каникулы");
        holiday.put(LocalDate.of(2024,1,6),"Ноаогодние каникулы");
        holiday.put(LocalDate.of(2024,1,7),"Рождиство Хршитово");
        holiday.put(LocalDate.of(2024,1,8),"Ноаогодние каникулы");
        holiday.put(LocalDate.of(2024,2,23),"День зашитника отечества");
        holiday.put(LocalDate.of(2024,3,8),"Международный женский день");
        holiday.put(LocalDate.of(2024,5,1),"День весны и труда");
        holiday.put(LocalDate.of(2024,5,9),"День Победы");
        holiday.put(LocalDate.of(2024,6,12),"День России");
        holiday.put(LocalDate.of(2024,10,4),"День народного единства");
        HolidaysSchedule schedule = new HolidaysSchedule(holiday);
        schedule.showSchedule();

    }
}
