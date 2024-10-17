import java.util.*;

public class largestog3num {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        float  num1= sc.nextFloat();
        float  num2= sc.nextFloat();
        float  num3= sc.nextFloat();
if( num1>=num2 && num1>=num3){
    System.out.print("num1 is largest");
}else if(num2>=num3 && num2>=num1){
    System.out.print("num2 islargest");
}else
System.out.print("num3 is largest");
    
}
}