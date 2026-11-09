package com.pluralsight;

import static org.junit.jupiter.api.Assertions.*;

class RoomTest {

    @org.junit.jupiter.api.Test
    void checkIn() {
        //Arrange
        Room testRoom = new Room(5, 100);
        boolean expectedOccupied = true;
        boolean expectedDirty = true;

        //Act
        testRoom.checkIn();

        //Test
        assertEquals(expectedDirty, testRoom.isDirty());
        assertEquals(expectedOccupied, testRoom.isOccupied());
    }

    @org.junit.jupiter.api.Test
    void checkOut() {
        //Arrange
        Room testRoom = new Room(5, 100);
        boolean expectedOccupied = false;
        boolean expectedDirty = true;

        //Act
        testRoom.checkIn();
        testRoom.checkOut();

        //Test
        assertEquals(expectedDirty, testRoom.isDirty());
        assertEquals(expectedOccupied, testRoom.isOccupied());
    }

    @org.junit.jupiter.api.Test
    void cleanRoom() {
        //Arrange
        Room testRoom = new Room(5, 100);
        boolean expectedOccupied = false;
        boolean expectedDirty = false;

        //Act
        testRoom.checkIn();
        testRoom.checkOut();
        testRoom.cleanRoom();

        //Test
        assertEquals(expectedDirty, testRoom.isDirty());
        assertEquals(expectedOccupied, testRoom.isOccupied());
    }
}