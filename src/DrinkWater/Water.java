package DrinkWater;

public class Water {
    private int capacity = 110;
    private String water = "water";

    //물이 줄어드는 메서드 = 물은 스스로 줄어든다
    public void reduceCapacity(int amount){
        if(capacity > 0){
            capacity -= amount;
            if(capacity < 0){
                capacity = 0;
            }
        }
    }
    public void plusWater(int amount){
        capacity += amount;
    }

    public int getCapacity(){
        return capacity;
    }

    public void changeGrape(String drink){
        water = "grapeJuice";
    }

    public String getWater(){
        return water;
    }
}
