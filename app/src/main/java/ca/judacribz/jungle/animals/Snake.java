package ca.judacribz.jungle.animals;

public class Snake extends Animal {

    private static int numSnakes = 0;

    public static int getNumSnakes() {
        return numSnakes;
    }

    public static void setNumSnakes(int numSnakes) {
        Snake.numSnakes = numSnakes;
    }

    public Snake(int energyLevel) {
        super(energyLevel);
        numSnakes++;
    }

    @Override
    public void sleep() {
        super.sleep();
//        System.out.println("SNAKE SLEEPING");
    }

    @Override
    public void eatFood() {
        super.eatFood();
//        System.out.println("SNAKE EATING");
    }

    @Override
    public void makeASound() {
        super.makeASound();
//        System.out.println("SNAKE MAKING A SOUND");
    }

}
