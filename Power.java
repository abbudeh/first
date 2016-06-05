import java.util.Scanner;
public class Power{

     public static void main(String []args){
         Scanner in = new Scanner(System.in);
         System.out.print("Enter a Number: ");
         final int num = in.nextInt();
         System.out.print("Enter a Power: ");
         int power = in.nextInt();
         int x = 1;
         int y = num;
         int z = 0;
         while(power != 0){
             while(x != 0){
                 while(y != 0){
                     z++;
                     y--;
                 }
                 y = num;
                 x--;
             }
             x = z;
             z = 0;
             power--;
         }
         System.out.println("Result is: " + x);
         for(int i=1;i<35;i++){
             if((i*35+1)%23 == 0){
                 System.out.println("Div ist: "+ (i*35+1)/23);
             }
         }
     }
    
}
