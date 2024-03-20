interface Drawable{
    void draw(int a);
}
interface Calculate{
    int substact(int x, int y);
}
public class lambda_q1 {
    public static void main(String args[]){
        Drawable d=(int a)->{
            System.out.println(a);
        };
        d.draw(5);
        Calculate c= (x,y)->{
            return x-y;
        };
        System.out.println("substract is: "+c.substact(8,5));
    }
}
