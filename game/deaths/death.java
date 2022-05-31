package game.deaths;

import java.util.Scanner;
import game.title;

public class death {
  public static void brokenDeath() {
    System.out.println(
        "Wrong answer, telling your character to do something they can't do is like telling a calculator to divide 0 by 0. You just can't.");
    System.out.println(
        "The fabric of space and time rips apart at the seams and your character is sucked in, instantly killing them. Game over.");
    System.out.println("Type 1 to restart, or 2 to exit.");
    Scanner restart = new Scanner(System.in);
    int selectRestart = restart.nextInt();
    if (selectRestart == 1) {
      title.title1();
    }
    else if (selectRestart == 2) {
      System.exit(0);
    }
    else {
      System.out.println("That's just not funny.");
      System.out.println("Type 1 to restart, or 2 to exit.");
      Scanner restart2 = new Scanner(System.in);
    int selectRestart2 = restart.nextInt();
    if (selectRestart2 == 1) {
      title.title1();
    }
    else if (selectRestart == 2) {
      System.exit(0);
    }
    else {
      System.out.println("f**k you.");
      System.exit(0);
    }
    }
  }

  public static void hpDeath() {

  }
}