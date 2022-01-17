import java.util.*;
class Display
{
    int input()
    {   Scanner sc=new Scanner(System.in);
        int ch;
        String s="WELCOME TO THE HANGMAN GAME!!!";
        int i,j,k;
        System.out.println("\t\t\t*********************************\n");
        System.out.print("\t\t\t  ");
        for(i=0;i<s.length();i++)
        {   
            System.out.print(s.charAt(i));
            for(j=1;j<=900000;j++)
            for(k=1;k<=100;k++);
        }
        System.out.println();
        System.out.println("\n\t\t\t*********************************\n\n");
        System.out.print("1.New Game\n2.Exit\n\nEnter your choice:");
        ch=sc.nextInt();
        return ch;
    }
}