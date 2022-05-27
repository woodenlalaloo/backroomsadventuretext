package game;

import java.util.Scanner;
import game.deaths.death;
import game.adventure;

public class title {
  public static void title1() {
    System.out.println("Type 1 to make a username, or 2 to begin");
    Scanner titleSelected = new Scanner(System.in);
    int titleOption1 = titleSelected.nextInt();
    if (titleOption1 == 1) {
      userMake();
    } else if (titleOption1 == 2) {
      adventure.mathTest();
    } else {
      death.brokenDeath();
    }
  }
  public static void userMake() {
    Scanner namer = new Scanner(System.in);
    System.out.println("Type a name.");
    String name = namer.next();
    System.out.println("Sending you back to title.");
    title1();
  }
}