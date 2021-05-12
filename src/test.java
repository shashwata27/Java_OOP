import java.util.ArrayList;
import java.util.Scanner;


public class test {
    
    public static void main(String[] args){
        Scanner ini=new Scanner(System.in);
        
        ArrayList<Integer> al=new ArrayList<Integer>();
        int len=ini.nextInt();
        al.add(len);

        System.out.println(al);
        for(int i=0;i<len;i++){
            al.add(ini.nextInt());
        }

        System.out.println(al);
    }
}
