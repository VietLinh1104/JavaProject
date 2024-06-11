import java.util.Scanner;  
import java.util.ArrayList;

public class myApp {
    public static int Euclid(int a, int b) 
    {
        int g;
        if(a == 0){
            return b;
        }else{
            do{
                g = a % b;
                a = b;
            }while(g != 0);
            return a;
        }
    }

    public static void main(String[] args) {
        int UCLN = Euclid(48,18);
        System.out.println("UCLN: " + UCLN + "!");
    }
}