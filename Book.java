package javaapplication;
public class Book {
   private int ID,zhyl,san,baga;
   private String avtor;
   
   public Book(){
       
   }
   
   public int getID(){
       return ID;
   }
    public int getZhyl(){
       return zhyl;
   }
     public int getSan(){
       return san;
   }
    public int getbaga(){
       return baga;
   }
   public String getavtor(){
      return avtor;
   } 
   
   public Book(int id,
           int zhyl, 
           int san, 
           int baga, 
           String avtor){
       this.ID = id;
       this.zhyl = zhyl;
       this.san = san;
       this.baga = baga;
       this.avtor = avtor;
   }
   
       public String toString()
    {
        return "Student{" +
                " id : " + ID + "|" +
                " zhyl : " + zhyl  + "|" +
                " better saby : " + san  + "|" +
                " bagasy : " + baga  + "|" +
                " avtor : " + avtor  +
                '}';

    }   
}
    
   

