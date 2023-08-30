package test;

public class DiceCalculator {
    public static int addDice(Dice first, Dice second) {
        return first.getNumber() + second.getNumber();
    }

    public static String getIndexof(String str, int index) {
//        char [] str = {'a', 'b', 'c', 'd', 'e', 'f', 'g'};
//        String res = "";
//        for(int i =0; i<val; i++)
//            res += str[i];
//        return res;
        return str.substring(0, index + 1);
    }

    public static boolean odd(Dice dice) {
        return dice.getNumber() % 2 != 0;
    }


}
