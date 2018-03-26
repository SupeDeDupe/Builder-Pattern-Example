
public class Car
{
    private String wheels;
    private String engine;
    private String seats;
    private String doors;
    
    public Car(CarBuilder builder)
    {
        wheels = builder.wheels;
        engine = builder.engine;
        seats = builder.seats;
        doors = builder.doors;
    }
    
    public void print()
    {
        System.out.println(this.wheels);
        System.out.println(this.engine);
        System.out.println(this.seats);
        System.out.println(this.doors);
        System.out.println();
    }
    
    public void printWheels()
    {
        System.out.println(this.wheels);
    }
    
    public void printEngine()
    {
        System.out.println(this.engine);
    }
    
    public void printSeats()
    {
        System.out.println(this.seats);
    }
    
    public void printDoors()
    {
        System.out.println(this.doors);
    }
}
