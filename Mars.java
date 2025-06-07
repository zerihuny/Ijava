public class Mars {
    String status;
    int speed;
    float temperature;

    void checkSpeed(){
        System.err.println("Checking speed...");
        System.out.println("Speed: " + speed);
        if (speed < 0) {
            status = "MarsRobot is not moving";
        } else if (speed > 10) {
            status = "MarsRobot is moving too fast";
        } else {
            status = "MarsRobot is moving at a normal speed";
        }
    }

    void checkTemperature() {
        if (temperature < -9) {
            status = "MarsRobot is feeling cold and cold";
        } else if (temperature > 20) {
            status = "Too hot, returning home";
            speed = 5;
        } else {
            status = "Temperature is normal";
        }
    }
    void showAttributes() {
        System.out.println("Status: " + status);
        // System.out.println("Speed: " + speed);
        System.out.println("Temperature: " + temperature);
    }
}
