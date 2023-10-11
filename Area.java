
class Shape{
    public void area(){
        System.out.println("area of shape");
        
    }
    public void perimeter(){
        System.out.println("perimeter of shape");
        
    }
}
class Circle extends Shape{
    public void area(int r){
          System.out.println("area of circle"+r*r*3.14);
        
    }
    public void perimeter(int r){
          System.out.println("perimeter of circle"+2*3.14*r);
        
    }
}
class Square extends Shape{
    public void area(int s){
          System.out.println("area of square"+s*s);
        
    }
    public void perimeter(int s){
          System.out.println("perimeter of Square"+4*s);
        
    }
}
public class Area{
    public static void main (String[] args) {
        Circle c=new Circle();
        Square s=new Square();
        c.area(6);
        s.area(4);
         c.perimeter(9);
        s.perimeter(4);
    }
}