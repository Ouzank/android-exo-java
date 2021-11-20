public class Dracaufeu extends Pokemon {

    public Dracaufeu() {
        super("Dracaufeu", "vol", 1.7, 90.5, true);
        //TODO Auto-generated constructor stub
    }

    @Override
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
       
        return 84;
    }

    @Override
    public void talent() {
        System.out.println("Mon talent est celui-ci....");
        System.out.println("Force-soleil : quand le soleil brille mon attaque augmente");
        
    }

    
    
}
