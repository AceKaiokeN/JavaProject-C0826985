public class Car extends Vehicle implements IPrintable{
    private boolean hasCar;
    private String CarType;
    private String CarColor;

    public Car(String regNo, String carType, String carColor,boolean hasCar) {
        super(regNo);
        this.CarType = carType;
        this.CarColor = carColor;
        this.hasCar = hasCar;
    }

    public void setCarType(String carType) {
        CarType = carType;
    }

    public void setCarColor(String carColor) {
        CarColor = carColor;
    }

    public String getCarType() {
        return CarType;
    }

    public String getCarColor() {
        return CarColor;
    }

    public boolean isHasCar() {
        return hasCar;
    }

    public void setHasCar(boolean hasCar) {
        this.hasCar = hasCar;
    }

    public void printMyData()
    {


            if(isHasCar() == true) {
                System.out.println("Employee has a Car");
                System.out.println("Registration Number is: " + getRegNo());
                System.out.println("It is having " + getCarColor() + " color");
                System.out.println("It's type is " + getCarType());
            }
             else
            {
                System.out.println("Employee has no Vehicle");
            }




    }

}
