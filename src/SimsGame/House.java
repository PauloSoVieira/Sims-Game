package SimsGame;

import SimsGame.Rooms.Room;
import SimsGame.Rooms.RoomType;

import java.util.ArrayList;
import java.util.Arrays;

public class House {
    private boolean occupied;
    private Room[] rooms;
    private HousesEnum type;

    private Room gym;
    private Room kitchen;
    private Room bedroom;
    private Room bathroom;
    private Room office;

    public House(boolean occupied, HousesEnum type) {
        this.occupied = occupied;
        this.type = type;
        initializeRooms();
    }

    private void initializeRooms() {
        RoomType[] roomTypes = type.getRooms();
        ArrayList<Room> roomList = new ArrayList<>();

        for (RoomType room : roomTypes) {
            switch (room) {
                case GYM:
                    gym = new Room(room);
                    roomList.add(gym);
                    break;
                case OFFICE:
                    office = new Room(room);
                    roomList.add(office);
                    break;
                case KITCHEN:
                    kitchen = new Room(room);
                    roomList.add(kitchen);
                    break;
                case BATHROOM:
                    bathroom = new Room(room);
                    roomList.add(bathroom);
                    break;
                case BEDROOM:
                    bedroom = new Room(room);
                    roomList.add(bedroom);
                    break;
                default:
                    System.out.println("That room doesn't exist");
            }
        }

        // Convertendo a lista de cômodos em um array
        rooms = roomList.toArray(new Room[0]);
    }

    // Métodos para acessar os cômodos específicos
    public Room getGym() {
        return gym;
    }

    public Room getKitchen() {
        return kitchen;
    }

    public Room getBedroom() {
        return bedroom;
    }

    public Room getBathroom() {
        return bathroom;
    }

    public Room getOffice() {
        return office;
    }

    public boolean isOccupied() {
        return occupied;
    }

    public void setOccupied(boolean occupied) {
        this.occupied = occupied;
    }

    public Room[] getRooms() {
        return rooms;
    }

    public HousesEnum getType() {
        return type;
    }

    @Override
    public String toString() {
        return type.getDescription() +
                " price=" + type.getPrice() +
                ", rooms : " + Arrays.toString(rooms) +
                '}';
    }
}
