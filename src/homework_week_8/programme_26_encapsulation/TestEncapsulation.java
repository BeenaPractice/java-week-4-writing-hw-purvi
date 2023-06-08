package homework_week_8.programme_26_encapsulation;

public class TestEncapsulation {
    public static void main(String[] args) {
        Encapsulate obj = new Encapsulate();
        // setting values of the variables
        obj.setName("Amit");
        obj.setAge(19);
        obj.setRollNo(51);
        // displaying values of the variavbles
        System.out.println("Prime's Name: " + obj.getName());
        System.out.println("Prime's Age: " + obj.getAge());
        System.out.println("Prime's rollno: " + obj.getRollNO());
        // direct access of rollNo not possible due to encapsulation
       // System.out.println("Prime's rollNo:" + obj.geekName);
    }
}
