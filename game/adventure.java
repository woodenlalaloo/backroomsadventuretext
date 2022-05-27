package game;

import java.util.Scanner;

public class adventure {
  public static void mathTest() {
    System.out.println("You are sitting in math doing a math test.");
    System.out.println("Press enter to continue");
    try {
      System.in.read();
    } catch (Exception e) {
    }
    noClip1();
  }

  public static void noClip1() {
    System.out.println("Suddenly you feel a tingling all over your body. A couple seconds later you fall through the floor and hit your head with a loud thud. You're knocked out.");
    System.out.println("You wake up. Your head is in a world of pain.");
    System.out.println("You stand up. You taste, dirt? you look around and see yellow walls and hear florecint lights.");
    System.out.println("You don't know what to do so you just start walking as you think to yourself: What is this place?");
    System.out.println("You: This looks like an office so there must be an exit.");
    search();
  }
  public static void search() {
    
  }
}