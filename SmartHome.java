
interface LightControl {

    void turnOn();

    void turnOff();

    void adjustBrightness(int level);
}

interface SpeakerControl {

    void playMusic();

    void stopMusic();

    void adjustVolume(int level);
}

interface SmartDevice {

    void connect();
}

class SmartLamp implements LightControl, SpeakerControl, SmartDevice {

    @Override
    public void turnOn() {
        System.out.println("SmartLamp: Light is turned ON.");
    }

    @Override
    public void turnOff() {
        System.out.println("SmartLamp: Light is turned OFF.");
    }

    @Override
    public void adjustBrightness(int level) {
        System.out.println("SmartLamp: Brightness adjusted to level " + level);
    }

    @Override
    public void playMusic() {
        System.out.println("SmartLamp: Playing music.");
    }

    @Override
    public void stopMusic() {
        System.out.println("SmartLamp: Music stopped.");
    }

    @Override
    public void adjustVolume(int level) {
        System.out.println("SmartLamp: Volume set to level " + level);
    }

    @Override
    public void connect() {
        System.out.println("SmartLamp: Connected to Wi-Fi.");
    }
}

public class SmartHome {

    public static void main(String[] args) {

        SmartLamp myLamp = new SmartLamp();

        myLamp.connect();
        myLamp.turnOn();
        myLamp.adjustBrightness(5);
        myLamp.playMusic();
        myLamp.adjustVolume(10);
        myLamp.stopMusic();
        myLamp.turnOff();
    }
}
