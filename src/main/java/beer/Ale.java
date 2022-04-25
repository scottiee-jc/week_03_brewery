package beer;

public class Ale extends Beer {

    private String name;
    private String storage;
    private boolean isHoppy;

    public Ale(int percentage, int price, int calories, String name, String storage) {
        super(percentage, price, calories);
        this.name = name;
        this.storage =  storage;
        this.isHoppy = false;
    }


    // g+s

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStorage() {
        return storage;
    }

    public void setStorage(String storage) {
        this.storage = storage;
    }

    public boolean isHoppy() {
        return isHoppy;
    }

    public void setHoppy(boolean hoppy) {
        isHoppy = hoppy;
    }

}
