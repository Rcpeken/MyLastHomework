public abstract class Plant implements IPlantActions {
    private String name;
    private int growthTime;
    private boolean isHarvestable;

    public Plant(String name, int growthTime) {
        this.name = name;
        this.growthTime = growthTime;
    }
    public void setHarvestable(boolean harvestable){
    this.isHarvestable=harvestable;
    }

    public String getName() {
        return name;
    }



    public int getGrowthTime() {
        return growthTime;
    }

    public void setGrowthTime(int growthTime) {
        this.growthTime = growthTime;
    }

    public boolean isHarvestable() {
        return isHarvestable;
    }

    public abstract void grow();

}
