
package ex36;
import java.util.*;

public class Ex36 {
public void maxprofit(int[] a){
    int max1=0,min1=0;
    for(int i=0;i<a.length;i++){
        min1=Math.min(min1, a[i]);
        int pro=Math.abs(a[i]-min1);
        max1=Math.max(pro, max1);
    }
    System.out.println("max profit is"+max1);
}
public void maxprofitmul(int[] a){
    int pro1=0;
    for(int i=1;i<a.length;i++){
        if(a[i]>a[i-1])
            pro1+=(a[i]-a[i-1]);
    }
    System.out.println("toal of max profit is"+pro1);
}
    
    public static void main(String[] args) {
        // TODO code application logic here
        Ex36 e=new Ex36();
        int a[]={5,2,6,1,4,7,3,6};
        e.maxprofit(a);
        e.maxprofitmul(a);
    }
    
}
