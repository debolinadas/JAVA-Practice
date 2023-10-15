
/*Write a program to print the area and perimeter of a triangle having sides of 3, 4 and 5 units 
by creating a class named 'Triangle' with constructor having the three sides as its parameters. */

class Triangle
{
    int s1,s2,s3;
    Triangle(int p1, int p2, int p3)
    {
        s1 = p1;
        s2 = p2;
        s3 = p3;
    }
    double area()
    {
        double savg = (s1+s2+s3)/2.0;
        return savg;
    }
    double peri()
    {
        double peri = s1+s2+s3;
        return peri;
    }
}
class class3 {
    public static void main(String[] args) {
        int l1 = 3,l2 = 4, l3 = 5;
        Triangle t = new Triangle(l1, l2, l3);
        System.out.println("area = "+t.area());
        System.out.println("Perimeter = "+t.peri());
    }
}
