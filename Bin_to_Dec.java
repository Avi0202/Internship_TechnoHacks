import java.util.*;
public class Bin_to_Dec {

    public static void main(String[] args) {
        while(true){
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Enter the number in binary");
        String binary=sc.nextLine();
        int decimal=0;
        
        for(int i=binary.length()-1;i>=0;i--)
              if(binary.charAt(i)=='1')
                decimal+=(int)Math.pow(2, i);
        
        System.out.println("The corresponding decimal number is "+decimal);
        System.out.println("Would you like to countinue\n1. Yes\n2. No");
        int choice=sc.nextInt();
        if(choice==2)
            break;
            
    }
        
    }
}