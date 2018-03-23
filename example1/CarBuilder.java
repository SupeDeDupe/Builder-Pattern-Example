
/**
 * @author Sarah Thompson
 * @version March 23, 2018
 */
public class CarBuilder
{
    public CarBuilder()
    {
        
    }

    public Car build()
    {
        return new Car(this);
    }
}
