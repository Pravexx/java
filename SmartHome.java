public class SmartHome {
    public static void main(String[] args) {
        Light L1 = new Light("hall light");
        Ac A1 = new Ac("Room Ac", 20);
        Fan F1 = new Fan("Living", 4);
        L1.Operate();
        A1.Operate();
        F1.Operate();

        L1.Operate();
        A1.Operate();
        F1.Operate();
    }
}

class Device{
    private String deviceName ;
    private boolean Status;

    public Device(String deviceName){
        this.deviceName = deviceName;
        this.Status = false;
    }
    public String GetDeviceName(){
        return deviceName;
    }
    public boolean Isstatus(){
        return Status;
    }
    public void setStatus(boolean Status){
        this.Status=Status;
    }

    public void Operate(){
        System.out.println("operating Device");
    }
}

class Light extends Device{
    public Light(String deviceName){
        super(deviceName);
    }
    public void Operate(){
        if(!Isstatus()){
            setStatus(true);
            System.out.println(GetDeviceName() + " is truned ON");
        }else{
            setStatus(false);
            System.out.println(GetDeviceName() + " is turned OFF");
        }
    }
}

class Fan extends Device{
    private int speed;
    public Fan(String deviceName,int speed){
        super(deviceName);
        this.speed=speed;
    }
    public void  Operate(){
        if(!Isstatus()){
            setStatus(true);
            System.out.println(GetDeviceName() + " is turned ON at speed of "+speed);
        }else{
            setStatus(false);
            System.out.println(GetDeviceName() + " is turned OFF");
        }
    }

}

class Ac extends Device{
    private int temp;
    public Ac(String deviceName,int temp){
        super(deviceName);
        this.temp = temp;
    }
    public void Operate(){
                if(!Isstatus()){
            setStatus(true);
            System.out.println(GetDeviceName() + " is turned ON at temp of "+temp+"°C");
        }else{
            setStatus(false);
            System.out.println(GetDeviceName() + " is turned OFF");
        }
    }
}

