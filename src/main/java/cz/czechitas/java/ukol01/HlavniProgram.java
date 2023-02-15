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

        zofka.turnLeft(135);
        zofka.move(380);
        zofka.turnLeft(90);
        zofka.move(700);

        zofka.penDown();
        namalujSlunicko(zofka);
        zofka.penUp();

    }

    private static void namalujSlunicko(Turtle zofka) {
        for (int i = 0; i < 18; i++) {
            zofka.turnRight(20);
            zofka.move(15);
        }
        for (int i = 0; i < 18; i++) {
            zofka.turnLeft(90);
            zofka.move(20);
            zofka.turnRight(180);
            zofka.penUp();
            zofka.move(20);
            zofka.turnLeft(70);
            zofka.move(15);
            zofka.penDown();
        }
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
