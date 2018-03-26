
public class CarBuilder
{
    String wheels;
    String engine;
    String seats;
    String doors;
    
    public CarBuilder()
    {
        
    }
    
    public Car build()
    {
        if (wheels == null)
            throw new IllegalStateException("No wheels!");
        if (engine == null)
            throw new IllegalStateException("No engine!");
        if (seats == null)
            throw new IllegalStateException("No seats!");
        if (doors == null)
            throw new IllegalStateException("No doors!");
        return new Car(this);
    }
    
    public CarBuilder addWheels(String wheels)
    {
        this.wheels = wheels;
        return this;
    }
    
    public CarBuilder addEngine(String engine)
    {
        this.engine = engine;
        return this;
    }
    
    public CarBuilder addSeats(String seats)
    {
        this.seats = seats;
        return this;
    }
    
    public CarBuilder addDoors(String doors)
    {
        this.doors = doors;
        return this;
    }
}
