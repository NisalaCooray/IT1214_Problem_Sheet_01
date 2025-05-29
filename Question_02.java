//Question_02

//1
class Vehicle
{
    private String licensePlate;
    private String ownerName;
    private int hoursParked;

	//constructor
    public Vehicle(String licensePlate, String ownerName, int hoursParked)
	{
        setLicensePlate(licensePlate);
        setOwnerName(ownerName);
        setHoursParked(hoursParked);
    }
	
	//getters
    public String getLicensePlate()
	{
        return licensePlate;
    }
    public String getOwnerName()
	{
        return ownerName;
    }
    public int getHoursParked()
	{
        return hoursParked;
    }
	//setters
    public void setLicensePlate(String licensePlate)
	{
        this.licensePlate = licensePlate;
    }
    public void setOwnerName(String ownerName)
	{
        this.ownerName = ownerName;
    }
    public void setHoursParked(int hoursParked)
	{
        this.hoursParked = hoursParked;
    }
}


//2
class ParkingLot
{
    private Vehicle[] vehicles;
    private int count=0;

    public ParkingLot(int capacity)
	{
        vehicles = new Vehicle[capacity];
    }

    public void parkVehicle(Vehicle vehicle)
	{
        if (count < vehicles.length)
		{
            vehicles[count] = vehicle;
            count++;
            System.out.println("Vehicle parked: " + vehicle.getLicensePlate() +"	Owner: " + vehicle.getOwnerName());
        }
		else
		{
            System.out.println("Parking lot is full.");
        }
    }

    public void removeVehicle(String licensePlate) {
        int index = -1;
        for (int i = 0; i < count; i++)
		{
            if (vehicles[i].getLicensePlate().equals(licensePlate))
			{
                index = i;
                break;
            }
        }

        if (index == -1)
		{
            System.out.println("Vehicle not found.");
            return;
        }

        for (int i = index; i < count - 1; i++)
		{
            vehicles[i] = vehicles[i + 1];
        }
		
        vehicles[count - 1] = null;
        count--;
        System.out.println("Vehicle removed: " + licensePlate);
    }

    public void displayVehicles()
	{
        if (count == 0)
		{
            System.out.println("No vehicles parked.");
        }
		else
		{
            System.out.println("Parked Vehicles:");
            for (int i = 0; i < count; i++)
			{
                System.out.println(vehicles[i]);
            }
        }
    }
}

//4
class Run
{
    public static void main(String[] args)
	{
        ParkingLot lot = new ParkingLot(5);

		System.out.println("");
        lot.parkVehicle(new Vehicle("ABC123", "John Doe", 2));
        lot.parkVehicle(new Vehicle("XYZ789", "Jane Smith", 4));
        lot.parkVehicle(new Vehicle("LMN456", "Bob Brown", 1));

		System.out.println("");
        lot.removeVehicle("XYZ789");

		System.out.println("");
        lot.displayVehicles();
    }
}
