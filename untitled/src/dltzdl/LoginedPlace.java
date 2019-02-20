package dltzdl;
import java.util.*;

public class LoginedPlace {

    int hscore;
    String user;

    public LoginedPlace(){
        hscore = 0;
    }

    public LoginedPlace(String luser){
        hscore = 0;
        user = luser;
    }

    public void run(){
        System.out.println("Welcome!");
        System.out.println("Game Start");
        int x = 30;
        int y = 30;
        System.out.println("Do you want to set game range?(Y/N)");
        Scanner up = new Scanner(System.in);
        String set = up.next();
        if(set.equals("Y")) {
            System.out.println("Please type x and y.");
            x = up.nextInt();
            y = up.nextInt();
        }
        for(;true;){ //game is here
           /* Scanner up = new Scanner(System.in);
            String useless = up.next();
            System.out.println("test!"); */
           boolean[][] graph = new boolean[x][y];
           for(int i=0;i<x;i++){
               for(int j=0;j<y;j++){
                   double a = Math.random();
                   if(a<0.5) {graph[i][j]=true;}
                   else {graph[i][j]=false;}
               }
           }
           graph[0][0]=true;
           graph[x-1][y-1]=true;
           boolean life = true;
            boolean going = true;
            int heart = 3;
            int location = 0;
            int score = 0;
           System.out.println("You start with (0,0)");  //100100
            System.out.println("a to left. w to up. s to down. d to right");
           for(;life&&going;){
               String k = up.next();
               int temp = location;
               if(k.equals("d")&&location%1000<x-1){location++;}
               if(k.equals("a")&&location%1000>0){location--;}
               if(k.equals("w")&&location/1000<x-1){location+=1000;}
               if(k.equals("s")&&location/1000>0){location-=1000;}
               score++;

               if(graph[location%1000][location/1000]){}
               else{heart--;
                   System.out.println("You injure! You life left: "+heart);}

               if(heart<=0){life = false;}

               if(location%1000==x-1&&location/1000==y-1){going = false;
                   System.out.println("You win!!!");}

           }
           if(score>hscore){hscore=score;}
           if(!life){System.out.print("Lost"); }
            System.out.println("Your highest score is"+hscore);
           break;
        }
    }
}
