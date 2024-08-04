package DrinkWater;

public class WaterMain {
    public static void main(String[] args) {
        Water water = new Water();
        Mj mj = new Mj();
        StoreMan storeMan = new StoreMan();

        mj.drinkWater(water);
        mj.drinkWater(water);
        mj.drinkWater(water);
        mj.plusWater(water);
        mj.plusWater(water);
        mj.plusWater(water);
        StoreMan.giveGrape(water);
        //상점 아저씨 = 물과 포도주스 교환
        // 민주가 물을 주면 아저씨가 포도주스로 바꿔줌 ㅋㅋ

    }
}

