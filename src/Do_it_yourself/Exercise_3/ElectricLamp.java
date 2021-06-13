package Do_it_yourself.Exercise_3;

public class ElectricLamp {
    private boolean status;

    public ElectricLamp() {
        status = true;
    }

    public ElectricLamp(boolean status) {
        this.status = status;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public void turnOn(){
        status = true;
        setStatus(status);
    }

    public void turnOff(){
        status = false;
        setStatus(status);
    }

}
