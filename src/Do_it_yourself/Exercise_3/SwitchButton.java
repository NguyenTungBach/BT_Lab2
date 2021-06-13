package Do_it_yourself.Exercise_3;

import Step_by_step.Exercise_2.Battery;
import Step_by_step.Exercise_2.FlashLamp;

public class SwitchButton {
    private boolean status;
    private ElectricLamp lamp;

    public SwitchButton() {
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public void switchOn(){
        status = true;
        setStatus(status);
    }

    public void switchOff(){
        status = false;
        setStatus(status);
    }

    public void connectToLamp(ElectricLamp lamp){
        this.lamp = lamp;
    }

    public boolean getLampInfo() {
        return lamp.isStatus();
    }

    public static void main(String[] args) {
        SwitchButton testSwitchButton = new SwitchButton();
        ElectricLamp testElectricLamp = new ElectricLamp();

        System.out.println("Connect the SwitchButton object to the ElectricLamp");
        System.out.println("Please Wait 2s...\n");
        testSwitchButton.connectToLamp(testElectricLamp);
        SwitchButton.timeWait();

        testSwitchButton.switchOn();
        System.out.println("ElectricLamp ON and wait 10s");
        for (int i = 0; i <10; i++){
            FlashLamp.timeWait();
            System.out.println(i+1);
        }
        testSwitchButton.switchOff();
        System.out.println("ElectricLamp OFF");

    }

    public static void timeWait() {
        try {
            Thread.sleep(500);
        }
        catch (Exception e){

        }
    }
}
