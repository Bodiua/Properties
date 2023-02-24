import java.util.Scanner;
public class Properties {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
            System.out.println ("Выберите машину, что бы узнать ее характеристики : (BMW / Ford Mustang / Tesla) :");
                String operation = scanner.nextLine();

        Road asfalt = new Road("асфальт");
        Road mud = new Road("грязюка");
        Road gruntovka = new Road("грутовка");

        Car bmw = new Car("BMW", 240);
        Car fordMustang = new Car("Ford Mustang", 210);
        Car tesla = new Car("Tesla", 300);

        Power easily = new Power("300");
        Power medium = new Power("400") ;
        Power hard = new Power("700");

        Engine small = new Engine("1.1");
        Engine averege = new Engine("1.6");
        Engine turbo = new Engine ("2.2");

        if(operation.equals("BMW"))
        {
            bmw.drive(asfalt,easily,small);
        }
        if(operation.equals("Ford Mustang"))
        {
            fordMustang.drive(mud,medium,averege);
        }
        if(operation.equals("Tesla"))
        {
            tesla.drive(gruntovka,hard,turbo);
        }
    }
}