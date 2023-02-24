public class Car {
    public String name;
    public int speed;

    public Car(String name, int speed) {
        this.name = name;
        this.speed = speed;
    }
    public void drive(Road road, Power power,Engine engine) {
        System.out.println("Отличный выбор !");
            System.out.println( name + ", едет со скоростью " + speed +" км/ч " + ", по дороге " + road.getRoadType()
                    + ", с мощностью " + power.getPowerType() + " лошадиных сил ," + "c обьемом двигателя = " + engine.getEngineType());
    }
    public void setName(String setName) {
        this.name = setName;
    }
    public void setSpeed(int speed) {
        this.speed = speed;
    }
}