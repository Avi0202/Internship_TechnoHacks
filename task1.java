import java.util.*;
class task1{
    public static void main(String args[]){
        Random rand=new Random();
        int d=rand.nextInt(100);
        int chances=20,choice,guess;
        boolean Valid_Choose=false,Play=true;
        Scanner sc=new Scanner(System.in);

        System.out.println("Welcome to number guessing game \nGuess the number between 0 and 100");
        
        while(Play){
        System.out.println("\n------------------------------------------------------------------------------------------\nChoose the difficultly\n1. Easy\n2. Medium\n3. Hard");
        choice=sc.nextInt();
        
        while(!Valid_Choose){
            Valid_Choose=true;
        switch(choice){
            case 1:chances=15;
                   break;
            case 2:chances=10;
                   break;
            case 3:chances=6;
                   break;
            default:System.out.println("Invalid choice !!!!!\n-------------------------------");
                    Valid_Choose=false;
                   break;                     
        }
    }
        for(int i=0;i<chances;i++){
            System.out.println("Guess the number : ");
            guess=sc.nextInt();

            if(guess==d){
               System.out.println("Congratulations you guessed the coorect number in  "+(i+1)+" turns");
               break;}
            else if(guess>d)
               System.out.println("Go lower!!!!!!");
            else
               System.out.println("Go Higher!!!!!");      

        }
        System.out.println("You want to play again\n1. Yes\n2. No");
        if(sc.nextInt()==2)
        Play=false;
    }
    System.out.println("\n\n\nThanks for playing!!!!!!!!!\n---------------------------------------------------------");
    }
    
}
