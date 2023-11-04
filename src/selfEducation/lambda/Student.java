package selfEducation.lambda;

public class Student {
    private String name;
    private double avGrade;
    private int age;
    private char sex;
    private int course;

    public Student(String name ,double avGrade, int age, char sex, int course) {
        this.avGrade = avGrade;
        this.age = age;
        this.sex = sex;
        this.course = course;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public double getAvGrade() {
        return avGrade;
    }

    public int getAge() {
        return age;
    }

    public char getSex() {
        return sex;
    }

    public int getCourse() {
        return course;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", avGrade=" + avGrade +
                ", age=" + age +
                ", sex=" + sex +
                ", course=" + course +
                '}';
    }
}
