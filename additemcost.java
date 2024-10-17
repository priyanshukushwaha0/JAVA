import java.util.*;
 public class additemcost{
    public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    float pencil=sc.nextFloat();
    float pen=sc.nextFloat();
    float eraser =sc.nextFloat();
    float total = pencil+pen+eraser;
    System.out.println(total);
    //add with gst18%
    float newtotal = total + (0.18f*total);
    System.out.println(newtotal);
    }
   }