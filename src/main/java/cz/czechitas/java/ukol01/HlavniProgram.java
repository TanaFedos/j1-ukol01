package cz.czechitas.java.ukol01;

import cz.czechitas.java.ukol01.engine.*;

public class HlavniProgram {

    public void start() {
        Turtle zofka = new Turtle();

        zofka.penUp();
        zofka.turnRight(180);
        zofka.move(150);
        zofka.turnRight(90);
        zofka.move(100);
        zofka.turnLeft(90);


        namalujPrasatko(zofka);

        zofka.turnLeft(135);
        zofka.move(300);
        zofka.turnLeft(90);
        zofka.move(320);

        zofka.penDown();
        namalujSlunicko(zofka);
        zofka.penUp();


        zofka.turnLeft(90);
        zofka.move(100);
        zofka.turnRight(90);
        zofka.move(50);

        for (int i = 0; i < 5; i++) {
            namalujDomecek(zofka);
            zofka.penUp();
            zofka.turnRight(90);
            zofka.move(200);
            zofka.turnRight(180);
        }

        zofka.move(150);
        zofka.turnLeft(90);
        zofka.move(150);
        zofka.turnRight(90);
        namalujDomecek(zofka);
        zofka.penUp();
        zofka.turnLeft(90);
        zofka.move(550);
        namalujDomecek(zofka);

        zofka.penUp();
        zofka.turnLeft(90);
        zofka.move(50);
        zofka.turnLeft(90);
        zofka.move(400);

        zofka.turnLeft(90);
        namalujT(zofka);
        zofka.turnLeft(90);
        namalujA(zofka);
        zofka.turnLeft(90);
        namalujN(zofka);
        zofka.turnLeft(90);
        namalujA(zofka);
    }

    private static void namalujN(Turtle zofka) {
        zofka.move(40);
        zofka.turnLeft(90);
        zofka.penDown();
        zofka.move(200);
        zofka.turnRight(153);
        for (int i = 0; i < 11; i++) {
            zofka.move(20);
        }
        zofka.turnLeft(153);
        zofka.move(200);
        zofka.penUp();
        zofka.turnRight(90);
        zofka.move(40);
        zofka.turnRight(90);
        zofka.move(200);
    }

    private static void namalujA(Turtle zofka) {

        zofka.move(100);
        zofka.turnLeft(90);
        zofka.move(200);
        zofka.penDown();
        zofka.turnLeft(164);
        for (int i = 0; i < 11; i++) {
            zofka.move(20);
        }
        zofka.penUp();
        zofka.turnLeft(105);
        zofka.move(120);
        zofka.turnLeft(105);
        zofka.penDown();
        for (int i = 0; i < 11; i++) {
            zofka.move(20);
        }
        zofka.penUp();
        zofka.turnLeft(148);
        for (int i = 0; i < 6; i++) {
            zofka.move(20);
        }
        zofka.penDown();
        zofka.turnLeft(109);
        zofka.move(60);
        zofka.penUp();
        zofka.move(70);
        zofka.turnRight(90);
        zofka.move(100);

    }

    private static void namalujT(Turtle zofka) {
        zofka.move(100);
        zofka.turnLeft(90);
        zofka.penDown();
        for (int i = 0; i < 10; i++) {
            zofka.move(20);
        }
        zofka.penUp();
        zofka.turnLeft(90);
        for (int i = 0; i < 3; i++) {
            zofka.move(20);
        }
        zofka.turnRight(180);
        zofka.penDown();
        for (int i = 0; i < 6; i++) {
            zofka.move(20);
        }
        zofka.penUp();
        for (int i = 0; i < 2; i++) {
            zofka.move(20);
        }
        zofka.turnRight(90);
        zofka.move(200);
    }

    private static void namalujSlunicko(Turtle zofka) {
        for (int i = 0; i < 18; i++) {
            zofka.turnRight(20);
            zofka.move(12);
        }
        for (int i = 0; i < 18; i++) {
            zofka.turnLeft(90);
            zofka.move(12);
            zofka.turnRight(180);
            zofka.penUp();
            zofka.move(12);
            zofka.turnLeft(70);
            zofka.move(12);
            zofka.penDown();
        }
    }

    private static void namalujPrasatko(Turtle zofka) {
        namalujDomecek(zofka);

        trouhelnik(zofka);

        zofka.move(100);
        zofka.turnRight(180);
        zofka.penDown();

        trouhelnik(zofka);

        zofka.turnLeft(90);
        zofka.move(50);
        zofka.turnRight(135);
        zofka.penDown();
        zofka.move(35);
        zofka.penUp();
    }

    private static void namalujDomecek(Turtle zofka) {
        zofka.penDown();
        zofka.move(50);
        zofka.turnRight(135);
        zofka.move(35);
        zofka.turnRight(90);
        zofka.move(35);
        zofka.turnRight(45);
        zofka.move(100);
        zofka.turnRight(90);
        zofka.move(50);
        zofka.turnRight(90);
        zofka.move(100);
    }

    private static void trouhelnik(Turtle zofka) {
        zofka.turnLeft(45);
        zofka.move(30);
        zofka.turnLeft(135);
        zofka.penUp();
        zofka.move(40);
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
