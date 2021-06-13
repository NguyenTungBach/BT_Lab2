package Do_it_yourself.Exercise_2;
//Do it yourself - Bài 2
public class Temperature {
    private double cTemp;

    public Temperature() {
    }

    public Temperature(double cTemp) {
        this.cTemp = cTemp;
    }

    public double getcTemp() {
        return cTemp;
    }

    public void setcTemp(double cTemp) {
        this.cTemp = cTemp;
    }

    public double getFTemp(){
        double f = (9/5* cTemp) +32;
        return f;
    }

    public double getKTemp(){
        double k = cTemp + 273.15;
        return k;
    }

    public static void main(String[] args) {
        Temperature test = new Temperature(25);
        System.out.println(test.getcTemp() + " ºC convert temperatures from Celsius to Fahrenheit = " + test.getFTemp() + " ºF");
        System.out.println(test.getcTemp() +" ºC convert temperatures from Celsius to Kelvin = " + test.getKTemp() + " ºK");
    }
}
