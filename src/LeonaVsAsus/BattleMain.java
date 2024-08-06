package LeonaVsAsus;

public class BattleMain {
    public static void main(String[] args) {
        Asus asus = new Asus();
        Leona leona = new Leona();
        Hp hp = new Hp();

        leona.LeonaPunch(hp);
        asus.AsusPunch(hp);
        leona.LeonaPunch(hp);
        asus.AsusPunch(hp);
        asus.AsusPunch(hp);
    }
}
