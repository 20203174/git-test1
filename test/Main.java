package test;

import java.util.Random;

public class Main {

    /**
    * main 메서드입니다.
    ***/
    public static void main(String[] args) {
        Random r = new Random();
        int random1 = r.nextInt(6) + 1;
        int random2 = r.nextInt(6) + 1;

        Dice first = new Dice(random1);
        Dice second = new Dice(random2);

        System.out.println("주사위 합 = " + DiceCalculator.addDice(first, second));

        String str = "abcdefg";
        int val = (r.nextInt() * str.length());
        System.out.println(DiceCalculator.getIndexof(str, val));

        int random4 = (r.nextInt(6)) + 1;
        Dice dice = new Dice(random4);
        System.out.println("주사위 눈이 홀수 : " + DiceCalculator.odd(dice));

        //도서관 생성

        try {
            new Library(-1);
        } catch (IllegalArgumentException exception) {
            System.out.println(exception.getMessage());
        }
        Library library = new Library(5);

        String str2 = "샬롯의 거미줄";

        library.add("해리포터");
        library.add(str2);

        try {
            library.add(str2);
        } catch (IllegalArgumentException exception) {
            System.out.println(exception.getMessage());
        }
        library.add(str2);
        library.delete(str2);

        try {
            library.delete("스파이더맨");
        } catch (IllegalArgumentException exception) {
            System.out.println(exception.getMessage());
        }
        library.find(str2);
        library.find("스파이더샤");
        library.findAll();

        try {
            library.add("java 22");
        } catch (IllegalArgumentException exception) {
            System.out.println(exception.getMessage());
        }
    }
}
