public class cs1020_tutorial_1_swap2{
  public static void main(String[] args){
    MyInteger a = new MyInteger(1);
    MyInteger b = new MyInteger(2);
    MyInteger.swap2(a, b);
    System.out.print(a.x + " "+ b.x);
  }
}

 class MyInteger {      
  public int x;      
  public MyInteger(int n) {           
    x = n; 
  }    // Are the int values swapped? 
  public static void swap2(MyInteger a, MyInteger b) { 
    int temp = a.x; 
    a.x = b.x; 
    b.x = temp; 
  }
}

