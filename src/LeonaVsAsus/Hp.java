package LeonaVsAsus;

public class Hp {
    private int LeonaHp = 30;
    private int AsusHp = 30;

    public void reduceLeonaHp(int power){
        if(LeonaHp>0){
            LeonaHp -= 10;
            if(LeonaHp<0){
                LeonaHp = 0;
            }
        }
    }
    public int getLeonaHp(){
        return LeonaHp;
    }

    public void reduceAsusHp(int power){
        if(AsusHp>0){
            AsusHp -= 10;
            if(AsusHp<0){
                AsusHp = 0;
            }
        }
    }
    public int getAsusHp(){
        return AsusHp;
    }
}
