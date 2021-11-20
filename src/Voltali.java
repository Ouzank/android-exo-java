public class Voltali extends Pokemon {

    public Voltali() {
        super("Voltali", "Electrik", 0.8, 24.5, false);
        //TODO Auto-generated constructor stub
    }

    @Override
    public void canEvolve(){
      
        if (this.getEvolve() == true ){
            System.out.println("Ce pokemon peut evoluer");
        } else {
            System.out.println("Ce pokemon ne peut pas evoluer");
        };
    }

 

    @Override
    public int attack() {
        // TODO Auto-generated method stub
        return 65;
    }

    @Override
    public void talent() {
        System.out.println("Mon talent est celui-ci....");
        System.out.println(
                "Absobe-volt : toute la fourrure de mon corps se dresse comme des aiguilles pour percer mes ennemies");
      
    }

   

   
    
}
