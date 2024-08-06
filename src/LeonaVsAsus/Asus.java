package LeonaVsAsus;

public class Asus {

    public void AsusPunch(Hp hp){
        hp.reduceLeonaHp(10);
        System.out.println("[아서스]의 펀치: \n 레오나: " + hp.getLeonaHp() +"/30");
    }



}
