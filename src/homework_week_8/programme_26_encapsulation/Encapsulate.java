package homework_week_8.programme_26_encapsulation;

public class Encapsulate {
    //private variable declared these can only be accessed by public methods of class
    private String name;
    private int rollNo;
    private int age;
    // set method for name to access private variable age
    public void setName(String name){
        this.name = name;
    }
    // get method for Name to access private variable age
    public String getName(){
        return name;
    }
    // get method for rollno to access private variable rollNO
    public int getRollNO(){
        return rollNo;
    }
    // set method for roll to access private variable rollNo
    public void setRollNo(int rollNo){
        this.rollNo = rollNo;
    }
    // get method for age to access private variable age
    public int getAge(){
        return age;
    }
    // set method for age to access private variable age
    public void setAge(int age){
        this.age = age;
    }
}
