package LeonaVsAsus;

public class Leona {

    public void LeonaPunch(Hp hp){
        hp.reduceAsusHp(10);
        System.out.println("[레오나]의 펀치 \n 아서스: " +hp.getAsusHp() +"/30");

    }
}
