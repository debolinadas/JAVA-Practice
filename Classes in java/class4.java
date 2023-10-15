
/* 1 --> Print the average of three numbers entered by user by creating a class named 'Average'
         having a method to calculate and print the average. */
/* 2 --> Write a program that would print the information (name, year of joining, salary, address) 
         of three employees by creating a class named 'Employee'. The output should be as follows:
          Name          Year of joining          Address
         Robert            1994                64C- WallsStreat
         Sam               2000                68D- WallsStreat
         John              1999                26B- WallsStreat */

class Average
{
    int n1,n2,n3;
    Average(int num1,int num2,int num3)
    {
        n1 = num1;
        n2 = num2;
        n3 = num3;
    }
    double avg()
    {
        double avg = (n1+n2+n3)/3;
        return avg;
    }
}

class Employee
{
    String name;
    int date;
    String address;
}
class class4 {
    public static void main(String[] args) {
        Average a = new Average(3,3,3);
        double res = a.avg();
        System.out.println("Average = "+res);

        Employee e1 = new Employee();
        e1.name = "Robert";
        e1.date = 1994;
        e1.address = "64C- WallsStreat";
        Employee e2 = new Employee();
        e2.name = "Sam";
        e2.date = 2000;
        e2.address = "68D- WallsStreat";
        Employee e3 = new Employee();
        e3.name = "John";
        e3.date = 1999;
        e3.address = "26B- WallsStreat";
        System.out.println("Employee 1 = "+ e1.name + "\t"+ e1.date + "\t" + e1.address);
        System.out.println("Employee 2 = "+ e2.name + "\t"+ e2.date + "\t" + e2.address);
        System.out.println("Employee 3 = "+ e3.name + "\t"+ e3.date + "\t" + e3.address);
    }
    
}
