package DrinkWater;

public class StoreMan {
    // 상점아저씨
    public static void giveGrape(Water water){
        water.changeGrape("grapeJuice");
        System.out.println("상점아저씨가 포도쥬스 줌: " + water.getWater());
    }


}