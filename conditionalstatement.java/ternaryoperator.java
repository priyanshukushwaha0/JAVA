
import java.util.*;
public class ternaryoperator {
   


    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        float  mark= sc.nextFloat();

    String reportcard = mark >=33 ? "PASS":"FAIL";
    System.out.print(reportcard);
    }
}
