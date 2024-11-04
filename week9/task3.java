package week9;

public class task3 {
    public static void main(String[] args) {
        // TV Object 1
        TV tv1 = new TV();
        tv1.turnOn();
        tv1.setChannel(30);
        tv1.setVolume(3);
        
        // TV object 2
        TV tv2 = new TV();
        tv2.turnOn();
        tv2.channelUp();
        tv2.channelUp();
        tv2.volumeUp();
        
        System.out.println("tv1's channel is " + tv1.channel 
            + " and volume level is " + tv1.volumeLevel);
        System.out.println("tv2's channel is " + tv2.channel 
            + " and volume level is " + tv2.volumeLevel);
    }


static class TV {
    int channel = 1; // Default value
    int volumeLevel = 1; // Default value
    boolean on = false;

    TV() { // Constructor
    }

    // turn on tv
    void turnOn() {
        on = true;
    }

    // turn off tv
    void turnOff() {
        on = false;
    }

    // set channel
    void setChannel(int newChannel) {
        if (on && newChannel >= 1 && newChannel <= 120) {
            channel = newChannel;
        }
    }

    // set volume
    void setVolume(int newVolumeLevel) {
        if (on && newVolumeLevel >= 1 && newVolumeLevel <= 7) 
            volumeLevel = newVolumeLevel;
        }
    void channelUp() {
        if (on && channel < 120) 
        channel++;
    }
    void channelDown() {
        if (on && channel > 1) 
        channel--;
    }
    void volumeUp() {
        if (on && volumeLevel < 7) 
        volumeLevel++;
    }
    void volumeDown() {
        if (on && volumeLevel > 1) 
        volumeLevel--;
    }
}

}