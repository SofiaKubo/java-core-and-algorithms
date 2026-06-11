package core.collections;

import java.util.ArrayList;
import java.util.HashMap;

public class Money {
  private static HashMap<Integer, ArrayList<Integer>> coins = new HashMap<>();

  public static void main(String[] args) {
    addCoin(5);
    addCoin(5);
    addCoin(3);
    addCoin(10);
    giveCoin(3);
    giveCoin(5);
    addCoin(3);
    giveCoin(5);
    giveCoin(5);
  }

  public static void addCoin(int coin) {
    ArrayList<Integer> coinStack = coins.get(coin);
    if (coinStack == null) {
      coinStack = new ArrayList<>();
      coins.put(coin, coinStack);
      System.out.println("Добавлена стопка для монеты " + coin);
    }
    coinStack.add(coin);
    System.out.println("Дзынь! Добавлена монета " + coin);
  }

  public static Integer giveCoin(int coin) {
    ArrayList<Integer> coinStack = coins.get(coin);

    if (coinStack == null || coinStack.isEmpty()) {
      System.out.println("Монет " + coin + " не осталось!");
      return null;
    }

    Integer give = coinStack.remove(coinStack.size() - 1);

    if (coinStack.isEmpty()) {
      coins.remove(coin);
      System.out.println("Стопка монет " + coin + " закончилась...");
    }

    System.out.println("Дзынь! Выдана монета " + coin);
    return give;
  }
}
