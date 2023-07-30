import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner k = new Scanner (System.in);

    int trials = 5;
    String p1g;
    
    System.out.println("Who is Player One (P1)?");
    String p1 = k.nextLine();
    System.out.println("Who is Player Two (P2)?");
    String p2 = k.nextLine();

    System.out.println(p1+", choose 3 parameters (Color, Size, and location where it is used) that "+p2+" has to use for his object");
    String p1p = k.nextLine().toUpperCase();

    System.out.println(p1+" has chosen "+p1p+" as his parameters. "+p2+", use these parameters to choose an object.");
    String p2o = k.nextLine().toUpperCase();
    
    for (int i=5; i < trials; i--) {
      System.out.println(p1+", "+p2+" has chosen an object. You have "+i+" tries");
      p1g = k.nextLine().toUpperCase();

      if (p1g == p2o) {
        System.out.println("Congrats! You guesse the number!");
          break;
      }

      else if (p1g != p2o && 1 != trials -1) {
        System.out.println("That is not the correct guess. Try again");
      }
      if (i == 1) {
      System.out.println("You have run out of guesses! If you want more, watch this ad or get the Unlimited Guesses pass!");
    }

    
  }
}
}
