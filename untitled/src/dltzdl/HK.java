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

        //孟子四心：仁：恻隐之心 义：羞恶之心 礼：恭敬之心 智：是非之心
        //四大哲学家 Muhammad Jesus Confucius 苏格拉底
        //哲学为人服务
        //西方哲学：1.澄清概念2.设定标准3.建立体系

}
