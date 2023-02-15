package cz.czechitas.java.ukol01;

import cz.czechitas.java.ukol01.engine.*;

public class HlavniProgram {

    public void start() {
        Turtle zofka = new Turtle();

        zofka.penUp();
        zofka.turnRight(90);
        zofka.move(250);
        zofka.turnRight(90);
        zofka.move(200);

        namalujPrasatko(zofka);

    }

    private static void namalujPrasatko(Turtle zofka) {
        zofka.penDown();
        zofka.move(100);
        zofka.turnRight(135);
        zofka.move(70);
        zofka.turnRight(90);
        zofka.move(70);
        zofka.turnRight(45);
        zofka.move(200);
        zofka.turnRight(90);
        zofka.move(100);
        zofka.turnRight(90);
        zofka.move(200);

        trouhelnik(zofka);

        zofka.move(200);
        zofka.turnRight(180);
        zofka.penDown();

        trouhelnik(zofka);

        zofka.turnLeft(90);
        zofka.move(105);
        zofka.turnRight(135);
        zofka.penDown();
        zofka.move(55);
        zofka.penUp();
    }

    private static void trouhelnik(Turtle zofka) {
        zofka.turnLeft(45);
        zofka.move(35);
        zofka.turnLeft(135);
        zofka.penUp();
        zofka.move(45);
        zofka.penDown();
        zofka.turnLeft(135);
        zofka.move(30);
        zofka.turnRight(135);
        zofka.penUp();
    }

    public static void main(String[] args) {
        new HlavniProgram().start();
    }

}
