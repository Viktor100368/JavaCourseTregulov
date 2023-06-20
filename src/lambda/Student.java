package lambda;

public class Student {
    private String name;
    private char sex;
    private int age;
    private int course;
    private double avgCgrade;

    public Student(String name, char sex, int age, int course, double avgCgrade) {
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.course = course;
        this.avgCgrade = avgCgrade;
    }

    public String getName() {
        return name;
    }

    public char getSex() {
        return sex;
    }

    public int getAge() {
        return age;
    }

    public int getCourse() {
        return course;
    }

    public double getAvgCgrade() {
        return avgCgrade;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", sex=" + sex +
                ", age=" + age +
                ", course=" + course +
                ", avgCgrade=" + avgCgrade +
                '}';
    }
}
