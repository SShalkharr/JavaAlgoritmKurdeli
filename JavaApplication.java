package javaapplication;
import java.util.Scanner;
public class JavaApplication {

    public static void main(String[] args) {
     Scanner s = new Scanner(System.in);
      
     Book book[] = new Book[3]; //class-ty massiv arkyly shakyru
        
     book[0] = new Book(001,2006,576,15000,"Shalkar");
     book[1] = new Book(002,2015,501,1300,"Bakyt");
     book[2] = new Book(003,1998,318,6000,"Dias");
     
      System.out.println("a) Avtor boinsha izdeu : ");
      //  String avtor = s.nextLine();
        int zhyl = s.nextInt();
        for (int i = 0; i <3 ; i++) {
            if(book[i].getZhyl() == zhyl){
                System.out.println(book[i].toString());
            }
        }
        
    }   
}


       
    