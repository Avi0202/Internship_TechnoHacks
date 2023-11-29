import java.util.*;
public class RockPaperScissor {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Random rand=new Random();
        boolean Play=true;
        System.out.println("-----------------Hi there---------------------\nLet's play Rock Paper Scissor!!!!!!!!!!!!!");
        while(Play){
            int ComputerChoice=rand.nextInt(3)+1;
            System.out.println("Enter your choice\n1. Rock\n2. Paper\n3. Scissor");
            int UserChoice=sc.nextInt();
            switch(UserChoice){
                case 1: if(ComputerChoice==1)
                           System.out.println("You chose Rock,So did your computer!!!!\n------------------------Tie!!!---------------------");
                        else if (ComputerChoice==2)
                            System.out.println("You chose Rock and your computer chose Paper!!!!\n------------------------You Lost!!!---------------------");
                        else
                           System.out.println("You chose Rock,and your computer chose Scissor!!!!\n------------------------You Won!!!---------------------");
                        break;
                case 2:  if(ComputerChoice==1)
                            System.out.println("You chose Paper and your computer chose Rock!!!!\n------------------------You Won!!!---------------------");
                         else if (ComputerChoice==2)
                            System.out.println("You chose Paper ,So did your computer!!!!\n------------------------Tie!!!---------------------");
                         else
                             System.out.println("You chose Paper,and your computer chose Scissor!!!!\n------------------------You Lost!!!---------------------");
                         break;
                case 3: if(ComputerChoice==1)
                            System.out.println("You chose Scissor and your computer chose Rock!!!!\n------------------------You Lost!!!---------------------");
                        else if (ComputerChoice==2)
                            System.out.println("You chose Scissor and your computer chose Paper!!!!\n------------------------You Won!!!---------------------");
                        else
                            System.out.println("You chose Scissor,So did your computer!!!!\n------------------------Tie!!!---------------------");
                        break;
                default:break;
            }
            System.out.println("You want to play again\n1. Yes\n2. No");
            if(sc.nextInt()==2)
                Play=false;
        }
    }
}
