public class Plane {
    private boolean isCheckedChassis;
    private boolean isFilledOil;
    private boolean isNoFrosted;

    public void checkChassis(){
        isCheckedChassis = true;
    }

    public void fillOil(){
        isFilledOil = true;
    }

    public void noFrost(){
        isNoFrosted = true;
    }

    public void fly() throws PlaneException{
        if(isCheckedChassis && isFilledOil && isNoFrosted){
            System.out.println("Разрешение на взлет полученно");
        }
        else {
            throw new PlaneException("Разрешение на взлет отклонено");
        }
    }
}
