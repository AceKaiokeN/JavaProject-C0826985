public class Motorcycle extends Vehicle implements IPrintable{

    private boolean hasMoto;
    private String MotoType;
    private String MotoColor;


    public Motorcycle(String regNo, boolean hasMoto, String motoType, String motoColor) {
        super(regNo);
        this.hasMoto = hasMoto;
        MotoType = motoType;
        MotoColor = motoColor;
    }

    public boolean isHasMoto() {
        return hasMoto;
    }

    public void setHasMoto(boolean hasMoto) {
        this.hasMoto = hasMoto;
    }

    public void setMotoType(String motoType) {
        MotoType = motoType;
    }

    public void setMotoColor(String motoColor) {
        MotoColor = motoColor;
    }

    public String getMotoType() {
        return MotoType;
    }

    public String getMotoColor() {
        return MotoColor;
    }


    public void printMyData(){
        if(getRegNo()!=null)
        {
            if(isHasMoto() == true)
                System.out.println("Employee has a Motorcycle");
                System.out.println("Registration Number is: "+getRegNo());
                System.out.println("It is having "+getMotoColor()+" color");
                System.out.println("It's type is "+getMotoType());
        }

        else
        {
            System.out.println("Employee has no Vehicle");
        }
    }
}
