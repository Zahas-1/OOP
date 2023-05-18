public class Animal {
    private String habitat;
    private String species;
    private String color;
    private double weight;

    public Animal(String habitat, String species, String color, double weight){
        setHabitat(habitat);
        setSpecies(species);
        setColor(color);
        setWeight(weight);
    }

    public String getHabitat(){
        return habitat;
    };
    public void setHabitat(String habitat){
        this.habitat=habitat;
    };
    public String getSpecies(){
        return species;
    };
    public void setSpecies(String species){
        this.species=species;
    }
    public String getColor(){
        return color;
    };
    public void setColor(String color){
      this.color=color;
    };

    public double getWeight(){
        return weight;
    };
    public void setWeight(double weight){
        this.weight=weight;
    };
    public void justEaten(){
        weight += 10;
    };
}
