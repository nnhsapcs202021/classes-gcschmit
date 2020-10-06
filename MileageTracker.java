
/**
 * This class models a mileage tracker for a car.
 *
 * @author gcschmit
 * @version 27 September 2020
 */
public class MileageTracker
{
    /*
     * 2. Definte the instance variables (store the object's attributes):
     *      specify the visibility (e.g., private)
     *          public: accessible by any code in any class
     *          private: only accessible by methods in this class
     *      specify the type (e.g., double)
     *      specify the name (e.g., milesDriven)
     *      
     *  Instance variables differ from local variables in the following ways:
     *      scoped to the class (accessible in all methods of the class;
     *          lifetime is the same as the object)
     *      automatically initialized to a default value (0, false, null)
     *      best practice is not to immediately initialize instance variables
     */
    private double milesDriven; // in units of miles
    private double fuelConsumed; // in units of gallons
    private String vin; // vehicle identification
    
    
    /*
     * 1. Define methods by specifying:
     *      the visibility (e.g., public)
     *      the return type (e.g., void)
     *      the method name (e.g., incrementMilesDriven)
     *      the parameters and their types (e.g., miles of type double)
     */
    
    /**
     * Increment the number of miles that the car has driven.
     * 
     * @param miles the additional distance, in miles, this car has driven
     */
    public void incrementMilesDriven(double miles)
    {
    }
    
    /**
     * Returns the total number of miles driven
     * 
     * @return the total number of miles driven
     */
    public double getMilesDriven()
    {
        return 0.0;
    }
    
    /**
     * Increment the number of gallons of fuel that this car has consumed
     * 
     * @param gallons    the additional fuel, in gallons, this car has consumed
     */
    public void incrementFuelConsumed(double gallons)
    {
        
    }
    
    /**
     * Returns the total number of gallons of fuel consumed
     * 
     * @return the total number of gallons of fuel consumed
     */
    public double getFuelConsumed()
    {
        return 0.0;
    }
    
    
    /**
     * Returns the current mileage, in miles per gallon
     * 
     * @return the current mileage, in miles per gallon
     */
    public double getMileage()
    {
        return 0.0;
    }
    
    /**
     * Returns the vehicle identification (VIN) of this car.
     * 
     * @return the vehicle identification (VIN) of this car
     */
    public String getVIN()
    {
        return null;
    }
    
    /**
     * Sets the vehicle identification (VIN) of this car.
     * 
     * @param newVIN    the vehicle identification (VIN) of this car
     */
    public void setVIN(String vin)
    {
        vin = vin;
    }
}






