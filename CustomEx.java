public  class CustomEx extends RuntimeException{

private String message;

public CustomEx(String message){
       super(message);
  }


}

public class main{

private int balance=50000;

public void getWithdraw(int amount){
if(amount>balance){
    
       throw new CustomEx("insufficient fund");
 
    }
balance=balance-amount;

}
public static void main(String[] args){

int i=10000;
CustomEx.getWithdraw(i);

}

}









