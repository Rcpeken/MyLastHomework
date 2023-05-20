public class FarmVille {
    public static void main(String[] args) {
        Farm farm =new Farm();
        TomatoPlant tomatoPlant=new TomatoPlant();
        TomatoPlant tomatoPlant1=new TomatoPlant();
        CarrotPlant carrotPlant=new CarrotPlant();
        CarrotPlant carrotPlant1=new CarrotPlant();

        farm.addPlant(tomatoPlant);
        farm.addPlant(carrotPlant);
        farm.addPlant(tomatoPlant1);
        farm.addPlant(carrotPlant1);

        for (int i = 0; i < 3; i++) {
            System.out.println("Day "+(i+1)+":");
            farm.simulateDay();
            System.out.println();
        }
    }
}