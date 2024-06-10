package SimsGame;

import SimsGame.Rooms.RoomType;

import java.util.Arrays;

public enum HousesEnum {
    // SMALL(50000,"Small SimsGame.Player.House",new SimsGame.Player.RoomType[]{SimsGame.Player.RoomType.BEDROOM,SimsGame.Player.RoomType.BATHROOM,SimsGame.Player.RoomType.KITCHEN}),
    HOUSE(80000, "Confy Home", new RoomType[]{RoomType.BEDROOM, RoomType.BATHROOM, RoomType.KITCHEN}),
    LARGEHOUSE(100000, "Large Home", new RoomType[]{RoomType.BEDROOM, RoomType.BATHROOM, RoomType.KITCHEN, RoomType.OFFICE}),
    LUXUARYHOUSE(200000, "Luxuary Home", RoomType.values());

    private int price;
    private String description;
    private RoomType[] roomTypes;


    HousesEnum(int price, String description, RoomType[] roomTypes) {
        this.price = price;
        this.description = description;
        this.roomTypes = roomTypes;
    }

    public int getPrice() {
        return price;
    }

    public String getDescription() {
        return description;
    }

    public RoomType[] getRooms() {
        return roomTypes;
    }

    @Override
    public String toString() {
        return description +
                " price=" + price +

                ", roomTypes=" + Arrays.toString(roomTypes) +
                '}';
    }
}
