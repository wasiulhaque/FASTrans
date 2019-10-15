package com.j.class_project;

import java.util.Random;

class Bus_name_seat {
    public String getData() {
        String[] busName = {
                "Ena",
                "Shaymoli",
                "Hanif",
                "Saudia",
                "Green Line",
                "London Express",
                "Showkhin",
                "Desh Travels"
        };
        String[] seat_number = {
                "A1",
                "B1",
                "A2"
        };
        String[] getSeat_number2 = {
                "J1",
                "E2",
                "G1",
        };

        Random random = new Random();
        int number= random.nextInt(busName.length);

        return busName[number];
    }
}
