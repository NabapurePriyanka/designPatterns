package creational.registry;

public class Student {
    private int id;
    private String name;
    int batch;

    private String instructor;
    private int startYear;
    private int endYear;

    public Student(int batch, String instructor, int startYear, int endYear) {
        this.batch = batch;
        this.instructor = instructor;
        this.startYear = startYear;
        this.endYear = endYear;
    }

    public Student() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBatch() {
        return batch;
    }

    public void setBatch(int batch) {
        this.batch = batch;
    }

    public String getInstructor() {
        return instructor;
    }

    public void setInstructor(String instructor) {
        this.instructor = instructor;
    }

    public int getStartYear() {
        return startYear;
    }

    public void setStartYear(int startYear) {
        this.startYear = startYear;
    }

    public int getEndYear() {
        return endYear;
    }

    public void setEndYear(int endYear) {
        this.endYear = endYear;
    }

    public void clone(Student s){
        this.batch = s.getBatch();

        this.instructor = s.getInstructor();
        this.startYear = s.getStartYear();
        this.endYear = s.getEndYear();
    }
}
