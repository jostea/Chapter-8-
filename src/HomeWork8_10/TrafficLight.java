package HomeWork8_10;

public enum TrafficLight {
    RED(30), GREEN(20), YELLOW(5);


     private int duration;

      TrafficLight(int duration) {
        this.duration=duration;
    }

    public int getDuration() {
        return duration;
    }
}



