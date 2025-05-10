import java.util.Scanner;

public class JavaBasics { 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number to check whether it is a armstrong number or not");
        int n = sc.nextInt();
        int real = n;
        int r = 0;
        while(n>0){
            int ld = n%10;
            r = r + (int)Math.pow(ld, 3);
            n/=10;

        }
        if(r==real){
                System.out.println("armstrong number");
            }else{
                System.out.println("not a armstrong number");
            }
        


        // int i = n%10;  //i=3
        // int m =n/10;   //m=15
        // int j = m%10;  //j=5
        // int o = m/10;  //o=1
        // int k = o%10;  //k=1
        // int c=(int)Math.pow(i,3)+(int)Math.pow(j,3)+(int)Math.pow(k,3); 
        // if(c==n){
        //     System.out.println("armstrong number");
        // }else{
        //     System.out.println("not a armstrong number");
        // }
       
        
    } 
}   



