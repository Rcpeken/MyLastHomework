public class TomatoPlant extends Plant  {
    private int waterLevel;

    public TomatoPlant() {
        super("Tomato",3);
        this.waterLevel=0;
    }

    @Override
    public void water() {
        waterLevel++;
    }

    @Override
    public void harvest() {
        if (isHarvestable()){
            System.out.println("Tomato Plant is ready to harvest");
            System.out.println("Tomato Plant has been harvested.Congratulations");
        }else
            System.out.println("Tomato Plant is not ready to harvest yet.");
    }

    @Override
    public void grow() {
        if (waterLevel>=getGrowthTime()){
            setHarvestable(true);
            System.out.println("Tomato Plant is growing. Growth time: "+ waterLevel+"/"+getGrowthTime());
        }else {
            setHarvestable(false);
            System.out.println("Tomato Plant is growing. Growth time: "+ waterLevel+"/"+getGrowthTime());
        }
    }
}
