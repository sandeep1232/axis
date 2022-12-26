import java.util.Scanner;
class evenorodd {
public static void main(String[] args) {
    int x;
    Scanner sc=new Scanner(System.in);
    System.out.println("enter a number");
    x=sc.nextInt();


    if(x%2==0){
        System.out.println("is even");
    }else{
        System.out.println("no is odd");
    }
} 
    
}

