/*This program will compute to find the catagory of a hurricane based of user entered speed.*/
import java.util.Scanner;
public class HurricaneSpeed {
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        int speed = 0;
        while (true){
        System.out.println("Enter the speed");
        speed = s.nextInt();
        if ((speed >74) && (speed <95)){
            System.out.println("Catagory 1");
        }
        else if ((speed >96) && (speed <110)){
            System.out.println("Catagory 2");
        }
        else if ((speed >111) && (speed <129)){
            System.out.println("Catagory 3");
        }
        else if ((speed >130) && (speed <156)){
            System.out.println("Catagory 4");
        }
        else  if (speed >= 157){
            System.out.println("Catagory 5 ");
        }
        else {
            System.out.println("too weak ");
        }
    }
}
}
