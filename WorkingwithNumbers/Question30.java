package WorkingwithNumbers;

import java.util.Scanner;

public class Question30 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the num 1");
        int n1 = sc.nextInt();
        System.out.println("Enter the num 2");
        int n2 = sc.nextInt();
        int hcf=0;
        for(int i =1;i<n1 || i<n2 ;i++){
            if(n1%i==0 && n2%i==0){
              hcf =i;
            }
        }
        int lcm = (n1 * n2)/hcf;
        System.out.println(lcm);
    }
}
