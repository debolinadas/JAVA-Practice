
class Complex
{
    float real, img;
    Complex(float r, float i)
    {
        this.real = r;
        this.img = i;
    }

    void display()
    {
        System.out.println(real+" +i"+img);
    }
}


public class Basics4 {
    public static void main(String[] args) {
        Complex c1 = new Complex(12.5f, 2.5f);
        Complex c2 = new Complex(9.5f, 0.5f);

        c1.display();
        c2.display();

         
    }
    
}
