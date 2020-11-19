package core;

public class Car
{


    private String number;
    private int height;
    private double weight;
    private boolean hasVehicle;
    private boolean isSpecial;

    public void setNumber(String number)
    {
        this.number = number;
    }

    public String getNumber()
    {
        return number;
    }

    public void setHeight(int height)
    {
        this.height = height;
    }

    public int getHeight()
    {
        return height;
    }
    public void setWeight(double weight)
    {
        this.weight = weight;
    }

    public double getWeight()
    {
        return weight;
    }
    public void setVehicle(boolean hasVehicle)
    {
        this.hasVehicle = hasVehicle;
    }

    public boolean hasVehicle()
    {
        return hasVehicle;
    }

    public void setSpecial(boolean isSpecial)
    {
        this.isSpecial = isSpecial;
    }

    public boolean isSpecial()
    {
        return isSpecial;
    }

    public String toString()
    {
        String special = isSpecial ? "СПЕЦТРАНСПОРТ " : "";
        return "\n=========================================\n" +
            special + "Автомобиль с номером " + number +
            ":\n\tВысота: " + height + " мм\n\tМасса: " + weight + " кг";
    }


}