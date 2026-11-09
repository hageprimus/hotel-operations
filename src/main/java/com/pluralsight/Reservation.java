package com.pluralsight;

public class Reservation {
    private static final double KING_PRICE = 139;
    private static final double DOUBLE_PRICE = 124;
    private static final double WEEKEND_SURCHARGE = 1.1;

    private String roomType;
    private int numberOfNights;
    private boolean isWeekend;

    public Reservation(String roomType, int numberOfNights, boolean isWeekend) {
        this.roomType = roomType;
        this.numberOfNights = numberOfNights;
        this.isWeekend = isWeekend;
    }

    public String getRoomType() {
        return roomType;
    }

    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }

    public int getNumberOfNights() {
        return numberOfNights;
    }

    public void setNumberOfNights(int numberOfNights) {
        this.numberOfNights = numberOfNights;
    }

    public boolean isWeekend() {
        return isWeekend;
    }

    public void setWeekend(boolean weekend) {
        isWeekend = weekend;
    }

    public double getPrice() {
        return (roomType.equalsIgnoreCase("king") ? KING_PRICE : DOUBLE_PRICE) * (isWeekend() ? WEEKEND_SURCHARGE : 1);
    }

    public double getReservationTotal() {
        return getPrice() * getNumberOfNights();
    }
}
