package com.multiplatform;

public class Main {

    public static void main(String[] args) {
        Pillow Phillips = new Pillow("60 kg", "40 cm","Robot RT-BF10 ");
        Bed Suzuki = new Bed ("150 Kg","Divan"," 50 cm ","40 cm");
        ClothHanger Honda= new ClothHanger("Miniso","apa Saja","apa saja");
        Fan Ninja= new Fan("apa saja","apa asja","saja apa");

        Room myDreamRoom = new Room(Suzuki, Phillips, Honda, Ninja);
        myDreamRoom.aboutRoom("Ruangan Kost Jhordy");
    }
}
