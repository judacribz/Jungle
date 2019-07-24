package ca.judacribz.jungle.animals;

public class Monkey extends Animal {
    private final static String
        MONKEY_SOUND = "Oooo Oooo Oooo",
        MONKEY_TIRED = "Monkey is too tired";
    private static int numMonkeys = 0;

    public static int getNumMonkeys() {
        return numMonkeys;
    }

    public static void setNumMonkeys(int numMonkeys) {
        Monkey.numMonkeys = numMonkeys;
    }

    public Monkey(int energyLevel) {
        super(energyLevel);
        numMonkeys++;
    }

//    @Override
//    public void sleep() {
//        super.sleep();
//        System.out.println("MONKEY SLEEPING");
//
//    }

    @Override
    public void eatFood() {
        incEnergy(2);
//        System.out.println("MONKEY EATING");
    }

    @Override
    public void makeASound() {
        decEnergy(4);
//        System.out.println("MONKEY MAKING A SOUND");
    }

    public void play() {
        if (energyLevel >= 8) {
            System.out.println(MONKEY_SOUND);
            decEnergy(8);
        } else {
            System.out.println(MONKEY_TIRED);
        }
    }
}
