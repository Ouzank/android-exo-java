public abstract class Pokemon implements Evolve{

    public String nom;
    public String type;
    public double taille;
    public double poids;
    public boolean evolve;
 

    public Pokemon(String nom, String type, double taille, double poids, boolean evolve) {
        this.nom = nom;
        this.type = type;
        this.taille = taille;
        this.poids = poids;
        this.evolve = evolve;
    }

  
    public abstract int attack();

    public abstract void talent();

    
    public void pokemon() {
        System.out.println("                    Pokemon !!! Attrapez les tous !!!");
        System.out.println(
                "      Je suis " + getNom() + " de type " + getType()+ ", je mesure " + getTaille() + " m et je pese " + getPoids()+" kg");
        
        System.out.println("Mon attaque est de "+attack());
    }


    public String getNom() {
        return nom;
    }


    public void setNom(String nom) {
        this.nom = nom;
    }


    public String getType() {
        return type;
    }


    public void setType(String type) {
        this.type = type;
    }


    public double getTaille() {
        return taille;
    }


    public void setTaille(double taille) {
        this.taille = taille;
    }


    public double getPoids() {
        return poids;
    }


    public void setPoids(double poids) {
        this.poids = poids;
    }



    public void setEvolve(boolean evolve) {
        this.evolve = evolve;
    }


    public boolean getEvolve() {
        return evolve;
    }

}
