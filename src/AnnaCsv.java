import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AnnaCsv {
    public static void main(String[] args) {
        List<String> fullList = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader("AnnaCsv.csv"))) {

            String line;
            try {
                while ((line = reader.readLine()) != null) {
                    fullList.add(line);

                }
               // System.out.println("это вся кишка, те файл -" + fullList);
                System.out.println("done!");

            } catch (IOException e) {
                e.printStackTrace();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        //++++++++++++++++++++++++++++++это весь код+++++++++++++++++++++++++++++++
        System.out.println(fullList);
        long start = System.nanoTime();
        String[] fullArrayFromRows = new String[fullList.size()];  //инициализируем стринг массив длинной в весь файл
        fullList.toArray(fullArrayFromRows);  //разбиваем всю кишку по строкам

        //  String[] rawMas = new String[fullArrayFromRows.length];  //создаем стринг массив рашный количеству строк
        List<String[]> rowsList = new ArrayList<>();  //создаем аррай лист для строк

        for (int i = 0; i < fullArrayFromRows.length; i++) {  //в цикле разбиваем каждую строку по cemicolon
            rowsList.add(fullArrayFromRows[i].split(";"));  //и кладем все в отдельные строки
        }
        //создаем лист моссивов для того, что-бы хранить значение колонок
        ArrayList<String[]> listArraysColumns = new ArrayList<>();
        for (int i = 0; i < fullArrayFromRows.length; i++) {
            String[] column = new String[rowsList.get(0).length];//на кождой итерации создаем новый локальный(временный) массив длинной равной headers
            //в итоге у нас получится матрица
            for (int j = 0; j < rowsList.get(i).length; j++) { //во внутреннем цикле (в той же итерации, в которой создали массив) идем по количеству
                //элементов которые лежат в конкретной строке(т.к. в кождой кроме headers количество элементов разное)
                column[j] = rowsList.get(i)[j]; // и кладем каждое отдельное значения в массив. по скольку значений колонок в стррке меньше чем heders
                //недостающие значеня оатоматически добиваются null-ами.
            }
            listArraysColumns.add(column); //записываем массив колонок в listArraysColumns
        }
        long end = System.nanoTime();

            System.out.println("колонка 2"+ "  " +getColumn(listArraysColumns, 2)); //читаем нужную колонку

        System.out.println("time = "+(end-start)/1000_000.0);

        //++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++

    }

//функция возвращает arrayList со значениями выбранной колонки
    public static ArrayList<String> getColumn(ArrayList<String[]> al, int n) {
        //создаем лист со значениями колонок
        ArrayList<String> column = new ArrayList<>();
        for (int i = 0; i < al.size(); i++) { //в каждой итерации берем отдельную строку

            //и записываем в лист значение колонки, где (i)-номер строки [n]-номер колонки по порядку
            if (al.get(i)[n] == null) { //если значение колонки равно null
                column.add("");//в моссив записываем пустую строку
            } else {
                column.add(al.get(i)[n]); //иначе записываем значение колонки
            }
        }
        return  column;
    }
}
