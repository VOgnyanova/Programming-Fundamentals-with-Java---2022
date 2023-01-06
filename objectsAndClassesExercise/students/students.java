package students;

public class students {
    private String name;
    private String secondName;
    private double grade;

    public students(String name, String secondName, double grade) {
        this.name = name;
        this.secondName = secondName;
        this.grade = grade;
    }
    public double getGrade(){
        return this.grade;

    }
    @Override
    public String toString(){
        return String.format("%s %s: %.2f",this.name,this.secondName,this.grade);
    }
}
