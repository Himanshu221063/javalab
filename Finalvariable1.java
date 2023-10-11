class A {
    public void display(){
         System.out.println("this is final methode");
    }
   
    }
    public class Finalvariable1 extends A{
        public void display(){
            System.out.println("the final methode is overriding");
        }
        
    public static void main(String[]args){
      Finalvariable1 a=new Finalvariable1();
     
        a.display();
        
    
}}