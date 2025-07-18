package abstraction;
import java.util.*;


interface Playable {
 void play();
}


class Veena implements Playable {
 public void play() {
     System.out.println("Playing the Veena...");
 }
}

class Saxophone implements Playable {
 public void play() {
     System.out.println("Playing the Saxophone...");
 }
}


public class Music {
 public static void main(String[] args) {
     Veena veena = new Veena();
     veena.play();

     Saxophone saxophone = new Saxophone();
     saxophone.play();

    
     Playable p1 = veena;
     Playable p2 = saxophone;

     p1.play();
     p2.play();
 }
}