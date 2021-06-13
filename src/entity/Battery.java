package entity;

public class Battery {
    private int energy;

    public Battery() {
        energy = 100;
    }

    public int getEnergy() {
        return energy;
    }

    public void setEnergy(int energy) {
        this.energy = energy;
    }

    public void decreaseEnergy() {
        energy--;
    }

}
