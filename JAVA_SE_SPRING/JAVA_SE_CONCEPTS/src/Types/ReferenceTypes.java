
package Types;

import java.util.Date;

public class ReferenceTypes {
    public static void main(String[] args) {
        TV tv1 = new TV();
        tv1.currentVolume = 20;
    }
}

class TV{
    int currentVolume;
    int currentChannel;
    boolean isOn;
    
    public void increaseVolume(){
        currentVolume = currentVolume + 1;
    }
    
    public void increaseChannel(){
        currentChannel = currentChannel + 1;
    }
    
    public void turnOn(){
        isOn = true;
    }
    
    public void turnOff(){
        isOn = false;
    }
}