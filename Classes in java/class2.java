/*Assign and print the roll number, phone number and address of two students having names "Sam" and "John" respectively
 by creating two objects of class 'Student'.
*/

class Student{
    int rollno;
    long phoneno;
    String address;
}

public class class2 {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.rollno = 5;
        s1.phoneno = 82740107;
        s1.address = "Naihati";

        Student s2 = new Student();
        s2.rollno = 2;
        s2.phoneno = 933025307;
        s2.address = "Behala";
        System.out.println("Student details 1 = "+ s1.rollno + "\t"+ s1.phoneno + "\t" + s1.address +  "\n");
        System.out.println("Student details 2 = "+ s2.rollno + "\t"+ s2.phoneno + "\t" + s2.address +  "\n");

    }
    
}
