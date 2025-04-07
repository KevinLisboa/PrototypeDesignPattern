public class Horse implements Animal {
    private int legs;
    private String sound;
    private String food;
    private String color;
    private String name;

    public Horse(int legs, String sound, String food, String color) {
        this.legs = legs;
        this.sound = sound;
        this.food = food;
        this.color = color;
    }

    public int getLegs() {
        return legs;
    }

    public String getSound() {
        return sound;
    }

    public String getFood() {
        return food;
    }

    public String getColor() {
        return color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public Horse clone() {
        try {
            Horse clonedHorse = (Horse) super.clone();
            clonedHorse.setName(null);
            return clonedHorse;
        } catch (CloneNotSupportedException e) {
            System.out.println("Cloning Horse not supported!");
            return null;
        }
    }

    @Override
    public void makeSound() {
        System.out.println(name + " says: " + sound + " (neigh)");
    }

    @Override
    public String getType() {
        return "Horse";
    }
}