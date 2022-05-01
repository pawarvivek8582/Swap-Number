public final class Immutable{

private final int id;
private final String name;
private final Engine engine;

public int getId(){
return id;
}

public String getName(){
return name;
}


public Immutable (int id,String name,Engine e){
    this.id=id;
    this.name=name;
Engine eng=new Engine(e.speed);
    this.engine=eng;
}

public static void main(String []args){
 Engine e=new Engine(50);
Immutable e=new Immutable(1,"vivek",e);
System.out.println(e.speed);
System.out.println(e.id+" "+e.name);
e.speed=70;
System.out.println(e.speed);

}

}

public class Engine{
public int speed;

public Engine(int speed){
this.speed=speed;

}




}














