package ca.judacribz.jungle.animals;

public class Tiger extends Animal {
    final private static String TIGER_EAT_GRAIN
            = "Can't eat grain";
    private static int numTigers = 0;

    public static int getNumTigers() {
        return numTigers;
    }

    public static void setNumTigers(int numTigers) {
        Tiger.numTigers = numTigers;
    }

    public Tiger(int energyLevel) {
        super(energyLevel);

        numTigers++;
    }

    @Override
    public void sleep() {
//        System.out.println("TIGER SLEEPING");
        incEnergy(5);
    }

    public void eatFood(boolean isGrain) {
        if (isGrain) {
            System.out.println(TIGER_EAT_GRAIN);
        } else {
            eatFood();
        }
    }

    @Override
    public void eatFood() {
        super.eatFood();
//        System.out.println("TIGER EATING");
    }

    @Override
    public void makeASound() {
        super.makeASound();
//        System.out.println("TIGER MAKING A SOUND");
    }
}
