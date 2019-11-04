import java.util.Arrays;
import java.util.Scanner;
class StickProblem{
public static vod main (String[]args){
int t;
Scanner in = new Scanner(System.in);
t=in.nextInt();
 while(t--!=0){
     int n=in.nextInt();
      int []a=new int[n];
       for(int i=0;i<n;i++){
        a[i]=in.nextInt();
        } 
Arrays.sort(a);
int max=0;
int imax=0;
for(int i=n-1;i>0;i--)
{if (a[i]==a[i-1]){
if(max==0)
    max=a[i];
else
imax=a[i];
i--;
}
if(imax*max==0)
system.out.println(-1);
else
system.out.println(imax*max);
    }
  }
}