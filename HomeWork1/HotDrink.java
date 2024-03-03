package HomeWork1;

abstract class HotDrink {
    private String name;
    private int volume;
    private int temperature;

    public HotDrink(String name, int volume, int temperature) {
        this.name = name;
        this.volume = volume;
        this.temperature = temperature;
        }

    public String getName() {
        return name;
    }

    public int getTemperature() {
        return temperature;
    }

    public int getVolume() {
        return volume;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    @Override
    public String toString() {
        return "HotDrink{" + "name='" + name + '\'' + ", volume=" 
        + volume + " ounces, " + "temperature=" + temperature + " degrees" + '}';
    }
}
