package SimsGame.Player;

import SimsGame.House;
import SimsGame.RandomNumberForHouse;

import java.util.ArrayList;

public class Sims {
    private House house;
    private String name;
    private int energy;
    private int money;
    private int dirtness;


    public Sims(String name, int money) {
        this.name = name;
        this.energy = 100;
        this.money = money;
        this.house = null;

    }

    public void findHome(int maxValue, ArrayList<House> houseArrayList) {

        ArrayList<House> availableHouses = new ArrayList<>();
        for (House findhouse : houseArrayList) {
            if (!findhouse.isOccupied() && findhouse.getType().getPrice() <= maxValue) {
                availableHouses.add(findhouse);
            }
        }

        if (availableHouses.size() > 0) {
            house = availableHouses.get(RandomNumberForHouse.generateRandomNumber(0, availableHouses.size() - 1));
            house.setOccupied(true);
            money = money - house.getType().getPrice();
            System.out.println(getName() + " bought " + house.getType().getDescription() + " for " + house.getType().getPrice());
            System.out.println(getName() + " current budget after buying " + house.getType().getDescription() + " is " + money);
        } else {
            System.out.println("There are no available houses on market for that budget");
        }

    }


    public House getHouse() {
        return house;
    }

    public int getMoney() {
        return money;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getEnergy() {
        return energy;
    }

    public void setEnergy(int energy) {
        this.energy = energy;
    }


}
