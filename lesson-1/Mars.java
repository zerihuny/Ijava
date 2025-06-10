public class Mars {
    String status = "Unknown";
    int speed = 0;
    float temperature = 0.0f;
    String state;
    char driection = 'N';
    

    void checkSpeed(){
        System.out.println("Checking speed...");
        System.out.println("Speed: " + speed);
        if (speed < 0) {
            state = "MarsRobot is not moving";
        } else if (speed > 10) {
            state = "MarsRobot is moving too fast";
        } else {
            state = "MarsRobot is moving at a normal speed";
        }
    }

    void checkTemperature() {
        if (temperature < -9) {
            status = "MarsRobot is feeling very cold";
        } else if (temperature > 20) {
            status = "MarsRobot is overheating, returning to base";
            speed = 5;
        } else {
            status = "Temperature is normal";
        }
    }
    void showAttributes() {
        System.out.println("Status: " + status);
        System.out.println("Speed: " + speed);
        System.out.println("State: " + state);
        System.out.println("Temperature: " + temperature);
    }
}
