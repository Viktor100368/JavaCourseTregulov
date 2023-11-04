package selfEducation.lambda;



import java.util.ArrayList;

public class StudentInfo {
    public void studentCheck(ArrayList<Student> al,CheckStudent cs){
        for(Student s:al){
            if(cs.check(s))
                System.out.println(s);
        }
    }
     public static void main(String[] args) {
        Student st1 = new Student("Maria",8.2,28,'f',3);
        Student st2 = new Student("Ivan",7.9,32,'m',4);
        Student st3 = new Student("Anton",6.8,19,'m',1);
        Student st4 = new Student("Natalia",8.8,30,'f',2);
        ArrayList<Student> sl = new ArrayList<>();
        sl.add(st1);
        sl.add(st2);
        sl.add(st3);
        sl.add(st4);
        StudentInfo info = new StudentInfo();
        info.studentCheck(sl, new CheckStudent() {
            @Override
            public boolean check(Student s) {
                return s.getAge()<30 && s.getAvGrade()>8;
            }
        });
    }
}
