package generics.game;

public class Main {
    public static void main(String[] args) {
        Scooler sc1 = new Scooler("ivan", 12);
        Scooler sc2 = new Scooler("Andrej",14);
        Scooler sc3 = new Scooler("Maria" ,14);
        Scooler sc4 = new Scooler("Sergi",12);
        Student st1 =new Student("Petr",19);
        Student st2 = new Student("Maxim",20);
        Employee emp1  =new Employee("Ivanich",45);
        Employee emp2 = new Employee("Petrovich",59);

        Team<Scooler> scoolerTeam = new Team<>("Dragon");
        scoolerTeam.addNewPartisipant(sc1);
        scoolerTeam.addNewPartisipant(sc2);

        Team<Scooler> scoolerTeam2 = new Team<>("Mudreci");
        scoolerTeam.addNewPartisipant(sc4);
        scoolerTeam.addNewPartisipant(sc3);

        Team<Student>studentTeam = new Team<>("Students");
        studentTeam.addNewPartisipant(st1);
        studentTeam.addNewPartisipant(st2);

        Team<Employee> employeeTeam = new Team<>("Employee");
        employeeTeam.addNewPartisipant(emp1);
        employeeTeam.addNewPartisipant(emp2);

        scoolerTeam.playWith(scoolerTeam2);
       // scoolerTeam.playWith(employeeTeam);
    }
}
