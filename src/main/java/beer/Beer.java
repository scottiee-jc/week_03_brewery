package beer;

public abstract class Beer {

    private int percentage;
    private int price;
    private int calories;
    private boolean containsGluten;

    //constructor

    public Beer(int percentage, int price, int calories) {
        this.percentage = percentage;
        this.price = price;
        this.calories = calories;
        this.containsGluten = true;
    }


    //G+S


    public int getPercentage() {
        return percentage;
    }

    public void setPercentage(int percentage) {
        this.percentage = percentage;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getCalories() {
        return calories;
    }

    public void setCalories(int calories) {
        this.calories = calories;
    }


    public boolean isContainsGluten() {
        return containsGluten;
    }

    public void setContainsGluten(boolean containsGluten) {
        this.containsGluten = containsGluten;
    }

    public boolean will2PintsGetYouDrunk(){
        return this.percentage >= 5;
    }

    public boolean isDietFriendly(){
        return this.calories <= 300;
    }

}
