public interface Seat {
    String seatType();

    int getSeatCount();
}
class privateCarSeat implements Seat {
    @Override
    public String seatType() {
        return "Private Car Seat";
    }
    @Override
    public int getSeatCount() {
        return 5;
    }
}
class racingCarSeat implements Seat {
    @Override
    public String seatType() {
        return "Racing Car Seat";
    }
    @Override
    public int getSeatCount() {
        return 1;
    }
}
class SUVCarSeat implements Seat {
    @Override
    public String seatType() {
        return "SUV Seat";
    }
    @Override
    public int getSeatCount() {
        return 15;
    }
}
class militaryCarSeat implements Seat {
    @Override
    public String seatType() {
        return "Military Car Seat";
    }
    @Override
    public int getSeatCount() {
        return 7;
    }
}