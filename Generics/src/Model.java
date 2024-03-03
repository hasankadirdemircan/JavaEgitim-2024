public class Model {

    public Model(String name, String weight, String height, String color) {
        this.name = name;
        this.weight = weight;
        this.height = height;
        this.color = color;
    }

    private String name;
    private String weight;
    private String height;
    private String color;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    public String getHeight() {
        return height;
    }

    public void setHeight(String height) {
        this.height = height;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
