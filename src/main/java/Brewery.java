import beer.Beer;
import spirits.Spirits;

import java.util.ArrayList;

public class Brewery {

private String name;
private String location;
private ArrayList<Beer> beers;
private ArrayList<Spirits> spirits;
private ArrayList<Staff> staff;


    public Brewery(String name, String location) {
        this.name = name;
        this.location = location;
        this.beers = new ArrayList<>();
        this.spirits = new ArrayList<>();
        this.staff = new ArrayList<>();
    }

// getters and setters

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public ArrayList<Beer> getBeers() {
        return beers;
    }

    public void setBeers(ArrayList<Beer> beers) {
        this.beers = beers;
    }

    public ArrayList<Spirits> getSpirits() {
        return spirits;
    }

    public void setSpirits(ArrayList<Spirits> spirits) {
        this.spirits = spirits;
    }

    public ArrayList<Staff> getStaff() {
        return staff;
    }

    public void setStaff(ArrayList<Staff> staff) {
        this.staff = staff;
    }


    // methods

    public void addBeer(Beer beer){
        this.beers.add(beer);
    }

    public void addSpirits(Spirits spirits){
        this.spirits.add(spirits);
    }
}
