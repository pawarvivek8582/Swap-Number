public class Singleton
{

  private static Singleton obj1=null;

  private Singleton(){
 
  }
 
public static Singleton getInstance(){
synchronized{
if(obj1==null){
    obj1= new Singleton();
 }
}
return obj1;

}

public static void main (String args[]){
           Singleton obj2= Singleton.getInstance();
           System.out.println(obj2.hashCode());
          Singleton obj3 =Singleton.getInstance();
          System.out.println(obj3.hashCode());
}
}