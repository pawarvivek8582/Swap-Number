
import java.util.*;

public class ReverseString{

public static void main(String []arg){

System.out.println("enter any String");
Scanner scanner=new Scanner(System.in);
String str=scanner.nextLine();

String rev="";

for(int i=str.length()-1;i>=0;i--){
      rev=rev+str.charAt(i);
}
System.out.println("Revese String is>> "+rev);

if(str.equals(rev)){
     System.out.println("The given string is palindrom"); 
   
   }else{
     System.out.println("The given string is not palindrom"); 
      }


}
}