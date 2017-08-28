/**
 * Created by apple on 2017/8/28.
 */

public class Saleclerk {

    private String name;
    private int password;

    Saleclerk(String name,int password)
    {
        this.name = name;
        this.password = password;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getName()
    {
        return name;
    }

    public void setPassword(int password)
    {
        this.password = password;
    }

    public int getPassword()
    {
        return password;
    }
}
