package com.cokeworld.book.springboot.domain.posts;

public class House {
    private int rooms;
    private int kitchens;
    private int restrooms;
    private int floors;

    public House rooms(int rooms) {
        this.rooms = rooms;

        return this;
    }

    public House kitchens(int kitchens) {
        this.kitchens = kitchens;

        return this;
    }

    public House restrooms(int restrooms) {
        this.restrooms = restrooms;

        return this;
    }

    public House floors(int floors) {
        this.floors = floors;

        return this;
    }

}


