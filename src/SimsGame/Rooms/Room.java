package SimsGame.Rooms;

public abstract class Room implements Activity {
    private RoomType roomType;

    public Room(RoomType roomType) {
        this.roomType = roomType;
    }

    public RoomType getRoomType() {
        return roomType;
    }

    public void setRoomType(RoomType roomType) {
        this.roomType = roomType;
    }

    @Override
    public String toString() {
        return
                "Room " + roomType
                ;
    }


}
