package Fibonacci;
import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args){
        int n, i=0, c;
        Scanner s=new Scanner(System.in);
        n = s.nextInt();
        for(c=1;c<=n;c++,i++){//for(i=0;i<n;i++){
            System.out.println(fibon(i));
        }

    }//end main
    public static int fibon(int in){
        if(in==0||in==1){//exclude the criteria of input 0 or 1 
            return in;
        }else{//sum of previous number n-1 and n-2
            return (fibon(in-1)+fibon(in-2));
        }
    }
}//end Fibonacci
