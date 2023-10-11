

public class constructorchaining {
    int sum;
    constructorchaining(){
        this(9,5);
    }
    constructorchaining(int i,int j){
        this.sum = i+j;
    }
    public  void display(){
       System.out.println("Sum : " + sum);
   }
    public static void main (String[] args) {
        constructorchaining a =new constructorchaining();
        a.display();
    }
}
