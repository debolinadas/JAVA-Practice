
class Student
{
    //Binding your data with methods using keyword - " Private "
    //bindng data with methods is known as Encapsulation
    int rollno;
    String name;
    
    //getters and setters
    //To fetch the values from a class we have to use methods 

    public void setRollno(int r) //set the value of roll no
    {
        rollno = r;
    }
    public int getRollno() //return the value of roll no
    {
        return rollno;
    }
}

public class Encapsulation 
{
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.setRollno(6);
        s1.name = "Debo";
        System.out.println(s1.getRollno());
        System.out.println(s1.name);
    }
    
}
