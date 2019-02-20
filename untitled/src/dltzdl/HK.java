package dltzdl;

public class HK {
    int size;
    int popl;
    String name;
    public HK(){
        size=114;
        popl=514;
        name="HKG";
    };
    public HK(int Hsize, int Hpop, String Hname){
        size = Hsize;
        popl = Hpop;
        name = Hname;
    }
    public String Hreport(){
        return("大小："+size+" 面积："+popl+" 名字："+name);
    }
    private String tank(){
        return("稍有常识的人都会看出，如果我们的铁骑继续前进，这个螳臂当车的歹徒，那能阻挡得了呢？");    }
}
