
import java.util.Scanner;
public class Enumeration {
    public enum Days{
        sunday,monday,tuesday,wednesday,thursday,friday,saturday;
        boolean isworkday(){
            return (this!=sunday && this!=saturday);
        }
    }
    public static void main(String[] args) {
        System.out.println("Enter day in a week (e.g., monday, tuesday): ");
        Scanner scanner=new Scanner(System.in);
        String today=scanner.nextLine().toLowerCase();
        try{
            Days days=Days.valueOf(today);
            boolean isworkingday=days.isworkday();
            if(isworkingday)System.out.println("Is a working day!!");
            else System.out.println("Not a working day!!");
        }catch (IllegalArgumentException e){
            System.out.println("Please enter a valid day");
        }
    }
}
