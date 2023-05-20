public class CarrotPlant extends Plant {
    private int waterLevel;
    public CarrotPlant(){
        super("Carrot",5);
        this.waterLevel=0;
    }
    @Override
    public void water() {
        waterLevel++;
    }

    @Override
    public void harvest() {
        if (isHarvestable()){
            System.out.println("Carrot Plant is ready to harvest");
            System.out.println("Carrot Plant has been harvested.Congratulations");
        }else
            System.out.println("Carrot Plant is not ready to harvest yet.");
    }

    @Override
    public void grow() {
        if (waterLevel>=getGrowthTime()){
            setHarvestable(true);
            System.out.println("Carrot Plant is growing. Growth time: "+ waterLevel+"/"+getGrowthTime());
        }else {
            setHarvestable(false);
            System.out.println("Carrot Plant is growing. Growth time: "+ waterLevel+"/"+getGrowthTime());
        }
    }
}
