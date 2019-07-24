package ca.judacribz.jungle.animals;


public class Animal {
    int energyLevel;

    public Animal(int energyLevel) {
        this.energyLevel = energyLevel;
    }

    public void makeASound() {
        decEnergy(3);
    }

    public void eatFood() {
        incEnergy(5);
    }

    public void sleep() {
        incEnergy(10);
    }

    public int getEnergyLevel () {
        return energyLevel;
    }

    public void incEnergy(int num) {
        this.energyLevel += num;
    }

    public void decEnergy(int num) {
        this.energyLevel -= num;
    }
}
