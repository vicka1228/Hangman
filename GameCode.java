import java.util.*;
class GameCode
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        String m="",s="";
        String mv[]={"CINDERELLA","PINOCCHIO","THE HUNGER GAMES","THE GODFATHER","SKYFALL","THE MASK","THE DARK KNIGHT","ICE AGE","MADAGASCAR","FINDING NEMO","MEN IN BLACK","VALKYRIE","INCEPTION","THE SHAWSHANK REDEMPTION","THE BOURNE LEGACY","INTERSTELLAR","HOME ALONE","WHIPLASH","GRAVITY","TITANIC"};
        int i,j,k,flag=0,ct=0,ct2=0;
        char c;
        Display ob=new Display();
        int ch=ob.input();
        switch(ch)
        {
            case 1: m=ChooseMovie.getRandom(mv);
            System.out.println("\nHow to play:\n-You need to enter letters to guess the movie name\n-The words of the movie name will be separated by a '/'\n-Once you enter a letter, all its occurences will be displayed at once.\n-If you enter a letter that is not in the movie name, a body part will be \nadded to the gallows in the following order: head, body, left arm, right arm, \nleft leg, right leg\n-Once the right leg is added, the game is over."); 
            System.out.println("\n  __________");
            System.out.println(" |     |    ");
            System.out.println(" |     ");
            System.out.println(" |     ");
            System.out.println(" |    ");
            System.out.println(" |    ");
            System.out.println(" |");
            System.out.println(" |_________\n");
            for(i=0;i<m.length();i++)
            {
                if(m.charAt(i)==' ')
                    s=s+"/ ";
                else
                    s=s+"_ ";
            }
            System.out.println(s);
            for(i=0; ;i++)
            {
                System.out.print("\nEnter a letter:");
                c=sc.next().charAt(0);
                c=Character.toUpperCase(c);
                for(j=0;j<m.length();j++)
                {
                    if(m.charAt(j)==c)
                    {  
                        s=s.substring(0,j*2)+c+s.substring(j*2+1);
                        ct++;
                    
                    }
                }   
                if(ct!=0)
                {System.out.println("Good guess! "+c+" appears "+ct+" time(s)");
                 System.out.println(s);
                }
                if(ct==0)
                   {   System.out.println("Wrong guess! Try again!");
                       flag++;
                    }
                    ct=0;
                switch(flag)
                {
                    case 1:System.out.println("\n  __________");
                    System.out.println(" |     |    ");
                    System.out.println(" |     0");
                    System.out.println(" |     ");
                    System.out.println(" |     ");
                    System.out.println(" |     ");
                    System.out.println(" |");
                    System.out.println(" |_________");
                    break;
                    case 2:System.out.println("\n  __________");
                    System.out.println(" |     |    ");
                    System.out.println(" |     0");
                    System.out.println(" |     | ");
                    System.out.println(" |     |");
                    System.out.println(" |     ");
                    System.out.println(" |");
                    System.out.println(" |_________");
                    break;
                    case 3:System.out.println("\n  __________");
                    System.out.println(" |     |    ");
                    System.out.println(" |     0");
                    System.out.println(" |    /| ");
                    System.out.println(" |     |");
                    System.out.println(" |     ");
                    System.out.println(" |");
                    System.out.println(" |_________");
                    break;
                    case 4:System.out.println("\n  __________");
                    System.out.println(" |     |    ");
                    System.out.println(" |     0");
                    System.out.println(" |    /|\\ ");
                    System.out.println(" |     |");
                    System.out.println(" |     ");
                    System.out.println(" |");
                    System.out.println(" |_________");
                    break;
                    case 5:System.out.println("\n  __________");
                    System.out.println(" |     |    ");
                    System.out.println(" |     0");
                    System.out.println(" |    /|\\ ");
                    System.out.println(" |     |");
                    System.out.println(" |    /  ");
                    System.out.println(" |");
                    System.out.println(" |_________");
                    break;
                    case 6:System.out.println("\n  __________");
                    System.out.println(" |     |    ");
                    System.out.println(" |     0");
                    System.out.println(" |    /|\\ ");
                    System.out.println(" |     |");
                    System.out.println(" |    / \\ ");
                    System.out.println(" |");
                    System.out.println(" |_________");
                    break;
                }
                if(flag>0 && flag<6)
                System.out.println((6-flag)+" body part(s) left\n"+s+"\n");
                if(flag==6)
                {
                    System.out.println("\n\nGame Over! The movie was: "+m+"\n\nTHANK YOU FOR PLAYING :)");
                    break;
                } 
                else
                {
                for(k=0;k<s.length();k++)
                {
                    if(s.charAt(k)=='_')
                    ct2++;
                }
                }
                if(ct2==0)
                break;
                ct2=0;
            }
        
            if(flag!=6)
                System.out.println("\nCongratulations! You Win!!\n\nTHANK YOU FOR PLAYING :)");
            break;  
            case 2:System.out.println("\nThank You!");
            break;
            default:System.out.println("\nWrong Input");
        
        }

    }
}

