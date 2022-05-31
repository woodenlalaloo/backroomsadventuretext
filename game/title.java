package game;

import java.util.Scanner;
import game.deaths.death;
import game.adventure;

public class title {
  public static void title1() {
    System.out.println("Type 1 to begin.");
    Scanner titleSelected = new Scanner(System.in);
    int titleOption1 = titleSelected.nextInt();
    if (titleOption1 == 1) {
      adventure.mathTest();
    } else {
      death.brokenDeath();
    }
  }
}