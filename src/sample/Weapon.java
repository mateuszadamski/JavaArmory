package sample;

public class Weapon {
    private String name;
    private String price;
    private int weight;
    private String category;
    private String strengh;
    private String avaliability;

    public Weapon(){
        this.name = " ";
        this.price = "0gc";
        this.weight = 0;
        this.category = " ";
        this.strengh = " ";
        this.avaliability = " ";
    }

    public Weapon(String name, String price, int weight, String category, String strengh, String avaliability) {
        this.name = name;
        this.price = price;
        this.weight = weight;
        this.category = category;
        this.strengh = strengh;
        this.avaliability = avaliability;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getStrengh() {
        return strengh;
    }

    public void setStrengh(String strengh) {
        this.strengh = strengh;
    }

    public String getAvaliability() {
        return avaliability;
    }

    public void setAvaliability(String avaliability) {
        this.avaliability = avaliability;
    }
}
