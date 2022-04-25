package spirits;

public abstract class Spirits {

private String name;
private int price;
private int percentage;
private int calories;
private String bestMixer;


    public Spirits(String name, int price, int percentage, int calories, String bestMixer) {
        this.name = name;
        this.price = price;
        this.percentage = percentage;
        this.calories = calories;
        this.bestMixer = bestMixer;
    }

    public String getName() {

        return name;
    }

    public int getPrice() {

        return price;
    }

    public int getPercentage() {

        return percentage;
    }

    public int getCalories() {

        return calories;
    }

    public String getBestMixer() {
        return bestMixer;
    }

    public void setBestMixer(String bestMixer) {
        this.bestMixer = bestMixer;
    }

    public boolean isLiqueur(){
        return this.percentage <= 35;
    }

    public boolean will2ShotsGetYouDrunk(){
        return this.percentage >= 45;
    }

}
