package dltzdl;
import java.util.*;


public class main {
    public static void main(String[] args) {
        System.out.println("Hello World");
        HK dlt = new HK(100,100,"dlt");
        System.out.println(dlt.Hreport());
        int ID=0;
        Account[] a = new Account[99999];
        for(;true;){
            System.out.println("Login(L) or Register(R)?");
            String LorR;
            Scanner LoR = new Scanner(System.in);
            LorR = LoR.next();
            if(LorR.contains("L")){
                String Usern,PW;
                System.out.println("Please enter your username");
                Usern = LoR.next();
                int po = 0;
                boolean check = false;
                for (int i = 0; i < ID; i++) {
                    if(Usern.matches(a[i].GetUsername())){
                     po = i;
                     check = true;
                    }
                }
                if(check){
                System.out.println("Please enter your password");
                PW = LoR.next();
                    if(PW.equals(a[po].GetPassword())){
                       LoginedPlace in = new LoginedPlace();
                       in.run();
                    }
                    else{System.out.println("Wrong Password!");}
                }
                else {System.out.println("Invalid User name");}
            }
            if(LorR.contains("R")) {
                boolean check = true;
                System.out.println("Please enter your username and password");
                String usern = LoR.next();
                String PW = LoR.next();
                for (int i = 0; i < ID; i++) {
                    if(usern.equals(a[i].GetUsername())){
                        System.out.println("Warning: Username has been used!");
                        check = false;
                    }
                }
                if(check){

                a[ID] = new Account(ID,usern,PW);
                ID++;
                }
            }
        }
    }
}
