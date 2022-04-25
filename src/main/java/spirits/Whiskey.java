package spirits;

public class Whiskey extends Spirits{

    private String location;
    private int barrelAge;
    private String barrelType;


    public Whiskey(String name, int price, int percentage, int calories, String bestMixer, String location, String barrelType, int barrelAge) {
        super(name, price, percentage, calories, bestMixer);
        this.location = location;
        this.barrelAge = barrelAge;
        this.barrelType = barrelType;
    }


    // g+s

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public int getBarrelAge() {
        return barrelAge;
    }

    public void setBarrelAge(int barrelAge) {
        this.barrelAge = barrelAge;
    }

    public String getBarrelType() {
        return barrelType;
    }

    public void setBarrelType(String barrelType) {
        this.barrelType = barrelType;
    }

    //meth

    public boolean isAged10YearsOrMore(){
        return this.barrelAge >= 10;
    }
}
