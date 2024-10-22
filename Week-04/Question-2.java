Q2)Can you create a Java class named `Mobile` with the following attributes: 

- `private String manufacturer`
- `private String operating_system`
- `public String color`
- `private int cost`

Include a parameterized constructor to initialize these attributes, along with getter and setter methods for each. Additionally, override the `toString()` method to display the object details.
Answer:
  public class Device {
    private String manufacturer, OS, color;
    private int cost;
    
    public Device(String man, String OS, String clr, int cst) {
        this.manufacturer = man;
        this.OS = OS;
        this.color = clr;
        this.cost = cst;
    }
    
    public void setManufacturer(String m) {
        this.manufacturer = m;
    }
    
    public String getManufacturer() {
        return manufacturer;
    }
    
    public void setOS(String OS) {
        this.OS = OS;
    }
    
    public String getOS() {
        return OS;
    }
    
    public void setColor(String clr) {
        this.color = clr;
    }
    
    public String getColor() {
        return color;
    }
    
    public void setCost(int cst) {
        this.cost = cst;
    }
    
    public int getCost() {
        return cost;
    }
    
    @Override
    public String toString() {
        return
            "manufacturer = " + manufacturer + "\n" +
            "operating_system = " + OS + "\n" +
            "color = " + color + "\n" +
            "cost = " + cost;
    }
    
    public static void main(String args[]) {
        Device device = new Device("Redmi", "Andriod", "Blue", 34000);
        System.out.println(device);
    }
}
