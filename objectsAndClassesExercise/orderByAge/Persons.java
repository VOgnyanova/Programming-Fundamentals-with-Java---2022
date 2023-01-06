package orderByAge;

public class Persons {
    private String name;
    private String ID;
    private  int age;


    public Persons(String name,String ID,int age){
        this.name = name;
        this.ID =ID;
        this.age = age;
    }
    public int getAge(){
        return this.age;
    }
    @Override
    public String toString() {
        return String.format("%s with ID: %s is %d years old.", this.name, this.ID, this.age);

    }
}
