import Animail.Animail;
import Chicken.Chicken;
import Tiger.Tiger;


public class Tes {
    public static void main(String[] args) {
        Animail[] animail = new Animail[2];
        animail[0] =new Tiger();
        animail[1]=new Chicken();
        for (Animail animail1 : animail){
            System.out.println(animail1.makeSound());
        }
    }
}
