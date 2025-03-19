import java.util.Scanner;
public class program3b {
    public static void main(String[] args){
        StringBuffer sb1 = new StringBuffer();
        System.out.println("Capacity of stringbuffer object sb1:"+sb1.capacity());
        StringBuffer sb2 = new StringBuffer("Hello");
        System.out.println("Capacity of stringbuffer object sb2:"+sb2.capacity());
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a string:");
        String str1=s.nextLine();
        StringBuffer revstr= new StringBuffer(str1);
        revstr.reverse().toString().toUpperCase();
        System.out.println("Reverse string in uppercase:"+revstr);
        System.out.println("Enter another string:");
        String str2=s.nextLine();
        System.out.println("Concatenated sting:"+str1+str2);
    }
}
