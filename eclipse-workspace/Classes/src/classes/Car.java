package classes;


public class Car 
{
// change case - convention that member variables are camel case.
private String color;
private int numberOfDoors;

public String getColor() 
{
    return color;
}

public void setColor(String color) 
{
    this.color = color;
}

public int getNumberOfDoors() 
{
    return numberOfDoors;
}

public void setNumberOfDoors(int numberOfDoors) 
{
    if ( numberOfDoors >= 1 && numberOfDoors <= 6)
        this.numberOfDoors = numberOfDoors;
    else
        this.numberOfDoors = -1;
}

// no-arg constructor
public Car() { }

// constructor with arguments
public Car(String color, int doors)
{
    this.setColor(color);
    this.setNumberOfDoors(doors);
}

public void start()
{
    System.out.println("Car starting");
}

public void stop()
{
    System.out.println("Car stopping");
}

public void drive()
{
    System.out.println("Car driving");
}

}
