package creational.registry;

public class Main {
    public static void main(String[] args) {
        StudentRegistry registry = new StudentRegistry();
        Student aug23 = new Student(23, "Manikya", 23, 24);
        Student aug24 = new Student(24, "Mohit", 24, 25);

        registry.addToRegistry("Aug23", aug23);
        registry.addToRegistry("Aug24", aug24);

        Student s1 = new Student();
        Student s2 = new Student();

        createCopies(s1, registry.getFromRegistry("Aug23") );


    }

    public static void createCopies(Student student, Student s){
        student.clone(s);
    }
}
