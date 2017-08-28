/**
 * Created by apple on 2017/8/28.
 */

public class Commodity {

    private String name;
    private double price;
    private int quality;

    Commodity(){}

    Commodity(String name,double price,int quality)
    {
        this.name = name;
        this.price = price;
        this.quality = quality;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getName()
    {
        return name;
    }

    public void setPrice(double price)
    {
        this.price = price;
    }

    public double getPrice()
    {
        return price;
    }

    public void setQuality(int quality)
    {
        this.quality = quality;
    }

    public int getQuality()
    {
        return quality;
    }

    public void printCommodity()
    {
        System.out.println(this.name+"  "+this.price+"  "+this.quality);
    }
}
