package dltzdl;

public class Account {
    String username;
    private String password;
    int ID;

    public Account(){}

    public Account(int IDA, String Usern, String PW){
        username = Usern;
        password = PW;
        ID = IDA;
    }

    public String GetUsername()
    {return username;}

    public String GetPassword()
    {return password;}

    public int GetID()
    {return ID;}
}
