package SimsGame;

import SimsGame.Player.Sims;

import java.util.ArrayList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.


        House confyhouse = new House(false, HousesEnum.HOUSE);
        House largeHouse = new House(true, HousesEnum.LARGEHOUSE);
        House luxuaryHouse = new House(false, HousesEnum.LUXUARYHOUSE);

        //  confyhouse.getRooms();

        ArrayList<House> houses = new ArrayList<>();


        houses.add(confyhouse);
        houses.add(largeHouse);
        houses.add(luxuaryHouse);

 /*       for (House house : houses) {
            System.out.println(house.getType());
        }
*/
        Sims sims = new Sims("Joao", 200000);

        sims.findHome(2000000, houses);

        System.out.println(sims.getHouse());

        sims.getHouse().getBathroom().;

    }
}