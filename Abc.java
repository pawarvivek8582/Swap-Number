public class Abc{

public static void main(String []args){

try{
System.out.println("this is 1st try block");

     try{
            System.out.println("this is 2nd try block");
        }catch(Exception e){
              e.printStackTrace();
        }finally{
           System.out.println("this is 2nd finaly block");

        }

}catch(Exception e){
e.printStackTrace();
}finally{
System.out.println("this is 1nd finaly block");

}

}

}


