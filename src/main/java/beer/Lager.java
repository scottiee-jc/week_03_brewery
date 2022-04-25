package beer;

public class Lager extends Beer {

    private String name;
    private String storage;

    public Lager(int percentage, int price, int calories, String name, String storage) {
        super(percentage, price, calories);
        this.name = name;
        this.storage = storage;
    }

    //g+s

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


}
