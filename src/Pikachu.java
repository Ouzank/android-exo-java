public class Pikachu extends Pokemon {


    public Pikachu() {
        super("Pikachu", "Electik" , 0.4, 7.0,true);
        
    }

    public void canEvolve() {

        if (this.getEvolve() == true) {
            System.out.println("Ce pokemon peut evoluer");
        } else {
            System.out.println("Ce pokemon ne peut pas evoluer");
        }
        ;
    }

   
    @Override
    public int attack() {
        
        return 55;
    }

    @Override
    public void talent() {
        System.out.println("Mon talent est celui-ci....");
      
        System.out.println("Statik : quand je charge mon corps en electricite statique, tout contact avec moi peut paralyser");
    }

  

  

}
