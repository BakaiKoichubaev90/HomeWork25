package HomeWork25;

public class Info {
    private int godVupuska;
    private String model;
    private int baasy;
    private String color;

    public Info(int godVupuska, String model, int baasy, String color) {
        this.godVupuska = godVupuska;
        this.model = model;
        this.baasy = baasy;
        this.color = color;
    }

    public int getGodVupuska() {
        return godVupuska;
    }

    public void setGodVupuska(int godVupuska) {
        this.godVupuska = godVupuska;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getBaasy() {
        return baasy;
    }

    public void setBaasy(int baasy) {
        this.baasy = baasy;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Info{" +
                "godVupuska=" + godVupuska +
                ", model='" + model + '\'' +
                ", baasy=" + baasy +
                ", color='" + color + '\'' +
                '}';
    }
}
