package lambda.check_workerman;

public class Workerman {
    private int id;
    private String name;
    private String surname;
    private int classWork;

    public Workerman(int id, String name, String surname, int classWork) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.classWork = classWork;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getClassWork() {
        return classWork;
    }

    @Override
    public String toString() {
        return "Workeman{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", classWork=" + classWork +
                '}';
    }
}
