public class SecondMax{

public static void main(String []args){
int []a={1,2,4,5,6};

int fMax=0;
int sMax=0;

for(int i=0;i<a.length;i++){
         if(a[i]>fMax){
          sMax=fMax;
           fMax=a[i];
           }else if((a[i]>sMax)&&(a[i]!=fMax)){
                sMax=a[i];
            
           }


   }

System.out.println(sMax);


}
}