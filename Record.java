import java.util.*;
class Student{
    int marks;
}

public class Record {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final int n = 5;

        Student obj[] = new Student[n];
        for (int i = 0; i < n; i++) {
            obj[i] = new Student();
            obj[i].marks = scanner.nextInt();
            System.out.println("sutdent marks is: " + obj[i].marks);
        }

        // Max marks from students
        int max_marks = obj[0].marks;

        for(int i = 1; i < n; i++){
            if(obj[i].marks > max_marks){
                max_marks = obj[i].marks;
            }
        }

        System.out.println("Maximum marks of the students entered: "+max_marks);
    }
}
