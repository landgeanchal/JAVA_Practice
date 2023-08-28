class Swap2{
  public static void main(String args[]){
      
      int x = 100;
      int y = 200;
      
      System.out.println("Before Swapping x = 100  and y = 200 ");
      x = x + y;   
      y = x - y;    
      x = x - y;  
     
    System.out.println("After Swapping");
    System.out.println("x = " + x + " and y = " + y);
  }

}