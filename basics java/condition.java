import java.util.*;

public class Condition {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        if(age >= 10){
            System.out.println("You are a teenager.");
        }else{
            System.out.println("You are a child.");
        }
    }
}