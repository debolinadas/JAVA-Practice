/*Write a program to print the area of a rectangle by creating a class named 'Area' having two methods.
 First method named as 'setDim' takes length and breadth of rectangle as parameters and 
 the second method named as 'getArea' returns the area of the rectangle. Length and breadth of rectangle are entered through keyboard.*/
import java.util.*;
class Area
{
    int length, breadth;
    void setDim(int x,int y)
    {
        length = x;
        breadth = y;
    }

    int getArea()
    {
        int area = length*breadth;
        return area;
    }
}

class class1
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int l, b;
        System.out.println("Enter the length and breadth of rectangle : ");
        l = sc.nextInt();
        b = sc.nextInt();
        Area a = new Area();
        a.setDim(l, b);
        int area = a.getArea();
        System.out.println("Area of the rectangle of length = "+l+" & breadth = "+b+" is "+ area);
        sc.close();
    }
}
