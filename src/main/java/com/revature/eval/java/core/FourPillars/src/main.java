import com.classes.Animal;
import com.classes.Bird;
import com.classes.Fish;
import com.classes.Mamal;
import com.exception.ErrorToCorrect;

public class main {

    public static void main(String[] args){

        // instance of mamal
        Mamal mamal = new Mamal("Lion","iris",20, true, "yellow", true  );

        // motion method from mamal
        mamal.move();


        // instance of bird
        Bird bird = new Bird("Eagle", "Convex", 2, true,
                "Sharp","Flat", 1000);

        // motion method from bird
        bird.move();

        // unchecked exception
        // we try to initialize an array of animal
        Animal[] arrayOfAnnil = new Animal[2];
         try {
             arrayOfAnnil[0] = mamal;
             arrayOfAnnil[1] = bird;
             arrayOfAnnil[2] = bird;

             for (Animal animal:arrayOfAnnil) {
                 System.out.println(animal.getName());
             }
          }catch (IndexOutOfBoundsException ex) {

             System.out.println("Error Index out of bounds with code " + ex.getMessage());

         }

        // calling a null fish swimming speed 0
        //checked exception
        try{

            Fish fish = new Fish(0);

        }catch(ErrorToCorrect e){

            System.out.println("an error occurs : " + e.getMessage());

        }

    }
}
