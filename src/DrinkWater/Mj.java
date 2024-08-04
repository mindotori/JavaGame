package DrinkWater;

public class Mj {
    //민주가 물을 마심
    public void drinkWater(Water water){
        water.reduceCapacity(20);
        System.out.println("민주가 물을 마십니다. 남은 물의 용량은: " + water.getCapacity());
    }
}
