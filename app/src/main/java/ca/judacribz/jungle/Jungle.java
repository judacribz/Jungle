package ca.judacribz.jungle;

import java.util.Random;

import ca.judacribz.jungle.animals.Animal;
import ca.judacribz.jungle.animals.Monkey;
import ca.judacribz.jungle.animals.Snake;
import ca.judacribz.jungle.animals.Tiger;

public class Jungle {
    private int
        MAX_TIGER_ENERGY = 50,
        MAX_SNAKE_ENERGY = 40,
        MAX_MONKEY_ENERGY = 70;
    private Tiger[] tigers;
    private Monkey[] monkeys;
    private Snake[] snakes;
    private int
        totalFood,
        numMeat,
        numFish,
        numBugs,
        numGrain;

    Random rand;

    public Jungle(int numTigers, int numMonkeys, int numSnakes) {
        rand = new Random();

        Tiger.setNumTigers(0);
        Monkey.setNumMonkeys(0);
        Snake.setNumSnakes(0);

        tigers = createTigers(numTigers);
        monkeys = createMonkeys(numMonkeys);
        snakes = createSnakes(numSnakes);

        createFood(
                rand.nextInt(10),
                rand.nextInt(10),
                rand.nextInt(10),
                rand.nextInt(10)
        );
    }

    private void createFood(int numMeat, int numFish, int numBugs, int numGrain) {
        totalFood = numMeat + numFish + numBugs + numGrain;
        this.numMeat = numMeat;
        this.numFish = numFish;
        this.numBugs = numBugs;
        this.numGrain = numGrain;
    }

    private Tiger[] createTigers(int num) {
        Tiger[] tigers = new Tiger[num];
        for (int i = 0; i < num; i++) {
            tigers[i] = new Tiger(rand.nextInt(MAX_TIGER_ENERGY));
        }

        return tigers;
    }

    public Monkey[] createMonkeys(int num) {
        Monkey[] monkeys = new Monkey[num];
        for (int i = 0; i < num; i++) {
            monkeys[i] = new Monkey(rand.nextInt(MAX_MONKEY_ENERGY));
        }

        return monkeys;
    }

    private Snake[] createSnakes(int num) {
        Snake[] snakes = new Snake[num];
        for (int i = 0; i < num; i++) {
            snakes[i] = new Snake(rand.nextInt(MAX_SNAKE_ENERGY));
        }

        return snakes;
    }

    private Animal getAnimal(int aniType) {
        Animal[] animals;
        if (aniType == -1) {
            aniType = rand.nextInt(3);
        }

        switch (aniType) {
            case 0:
                animals = tigers;
                break;
            case 1:
                animals = monkeys;
                break;
            default:
                animals = snakes;
                break;
        }

        return animals[rand.nextInt(animals.length)];
    }

    void randomActivity() {

        int activityType = rand.nextInt(4);
        Animal animal = getAnimal(-1);

        switch (activityType) {
            case 0:
                animal.makeASound();
                break;
            case 1:
                animal.eatFood();
                break;
            case 2:
                animal.sleep();
                break;
            default:
                monkeyPlay();
                break;
        }

    }

    private void monkeyPlay() {
        ((Monkey)getAnimal(1)).play();
    }

    public void soundOff() {
        soundOff(tigers);
        soundOff(monkeys);
        soundOff(snakes);
    }

    void soundOff(Animal[] animals) {
        for (Animal animal : animals) {
            animal.makeASound();
        }
    }
}
