package spirits;

import java.util.ArrayList;

public class Gin extends Spirits {

private ArrayList<String> botanicals;

    public Gin(String name, int price, int percentage, int calories, String bestMixer) {
        super(name, price, percentage, calories, bestMixer);
        this.botanicals = new ArrayList<>();
    }

    public ArrayList<String> getBotanicals() {
        return botanicals;
    }

    public void setBotanicals(ArrayList<String> botanicals) {
        this.botanicals = botanicals;
    }

}
