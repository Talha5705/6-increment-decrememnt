
package increment.decrememnt;
import java.util.Scanner;


public class IncrementDecrememnt {

    int x;
    public static void main(String[] args) {
     
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Enter the value of X");
        int x=sc.nextInt();
        int y;
        
//x er value dilam 4
        y=--x;
        System.out.println("Pre decrement --X= "+y); //ekhane x er value hobe 3
        
        y=x--;
        System.out.println("Post decrement X--= "+ y); ////x er val last a ja pabe ta e show korbe,
                                                         //  pore kothaw x pele tokhn kombe
        
        y=++x;                  //ekhane abar x pabe, so aage post decrement korbe. korle val
                          //hobe 2.then korbe pre increment, value hobe 3.
        System.out.println("Pre Increment ++X= "+ y); //ekhane value hobe 3.
        
        y=x++;
        System.out.println("Post Increment X++= "+y); //x er val ja dewa hobe ta e show korbe,
                                                         //  pore kothaw x pele tokhn barbe
        
        
        
    }
    
    
}
