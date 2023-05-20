import java.util.ArrayList;

public class Farm {
    private ArrayList<Plant> plants;

    public Farm() {
        this.plants = new ArrayList<>();
    }

    public void simulateDay(){
        for (Plant plant : plants){
            plant.water();
            plant.grow();
            plant.harvest();

        }
    }

    public void addPlant(Plant plant){
        plants.add(plant);
    }

}
