/*
 * Corbin Nash
 * This program makes basic poetry 
 * and open the template in the editor.
 */
package giggity;
/**
 *
 * @author conas1290
 */
import java.util.ArrayList;

public class Giggity {
  public static void main(String [] args) {
    //This program will use a dynamic arrays
    ArrayList<String> nouns = new ArrayList<String>();
    nouns.add("cat");
    nouns.add("dog");
    nouns.add("horse");
    nouns.add("goat");
    nouns.add("eagle");
    nouns.add("lion");
    nouns.add("giraffe");

    ArrayList<String> verbs1 = new ArrayList<String>();
    verbs1.add("ate");
    verbs1.add("galloped");
    verbs1.add("jumped");
    verbs1.add("raced");
    verbs1.add("ran");
    verbs1.add("tripped");
    verbs1.add("guessed");
    verbs1.add("tapped");
    
    ArrayList<String> verbs2 = new ArrayList<String>();
    verbs2.add("eat");
    verbs2.add("sleep");
    verbs2.add("jump");
    verbs2.add("race");
    verbs2.add("run");
    verbs2.add("trip");
    verbs2.add("guess");
    verbs2.add("tap");

    ArrayList<String> rhymingNouns = new ArrayList<String>();
    rhymingNouns.add("schoolhouse");
    rhymingNouns.add("house");
    rhymingNouns.add("doghouse");
    rhymingNouns.add("beachhouse");
    rhymingNouns.add("treehouse");
   
    ArrayList<String> rhymingNouns2 = new ArrayList<String>();
    rhymingNouns2.add("mouse");
    rhymingNouns2.add("spouse");
    rhymingNouns2.add("blouse");
    String noun;
    String verb1, verb2;
    String rhymingNoun1, rhymingNoun2, rhymingNoun3;
    int randomNum;

    //get a random noun from the nouns array
    //use .size() to get the # of elements
    randomNum = (int) (Math.random() * nouns.size());
    noun = nouns.get(randomNum);

    //get the first random verb from the verbs array &
    // remove from ArrayList
    randomNum = (int) (Math.random() * verbs1.size());
    verb1 = verbs1.get(randomNum);
    verbs1.remove(randomNum);

    //get the second random verb from verbs array and remove it
    randomNum = (int) (Math.random() * verbs2.size());
    verb2 = verbs2.get(randomNum);
    verbs2.remove(randomNum);

    //get the first rhyming noun and remove it
    randomNum = (int) (Math.random() * rhymingNouns.size());
    rhymingNoun1 = rhymingNouns.get(randomNum);
    rhymingNouns.remove(randomNum);

    //get the second rhyming noun and remove it
    randomNum = (int) (Math.random() * rhymingNouns.size());
    rhymingNoun2 = rhymingNouns.get(randomNum);
    rhymingNouns.remove(randomNum);
        //get the second rhyming noun and remove it
    randomNum = (int) (Math.random() * rhymingNouns2.size());
    rhymingNoun3 = rhymingNouns2.get(randomNum);
    rhymingNouns2.remove(randomNum);

    //Display the poem
    System.out.println("The " + noun + " " + verb1 + " into a " + 
      rhymingNoun1 + "\n" + "so it could " + verb2 + 
      " into the " + rhymingNoun2 +"\n" + "but it was a " + rhymingNoun3
    
    );
  }
}