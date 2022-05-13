public class Drone_Driver_Info {
    private int id;
    private String height;
    private String weight;
    private String width;
    private String status;

public Drone_Driver_Info(){}
    public Drone_Driver_Info(int id, String height, String weight, String width, String status) {
        this.id = id;
        this.height = height;
        this.weight = weight;
        this.width = width;
        this.status = status;
    }



    public String getHeight() {
        return height;
    }

    public void setHeight(String height) {
        this.height = height;
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    public String getWidth() {
        return width;
    }

    public void setWidth(String width) {
        this.width = width;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}