//method overloading

class Casio
{
    public void addit(int m, int n)
    {
        System.out.println(m+n);
    }
    public void addit(int m, int n, int o)
    {
        System.out.println(m+n+o);
    }
    public void addit(double m, double n)
    {
        System.out.println(m+n);
    }
}

public class Methodover 
{
    public static void main(String[] args) 
    {
        Casio obj = new Casio();
        obj.addit(5, 2);

        obj.addit(4, 3, 5);

        obj.addit(4.5 , 2.3);
    }
}
