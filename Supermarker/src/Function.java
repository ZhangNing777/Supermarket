import java.util.Scanner;

/**
 * Created by apple on 2017/8/28.
 */
public class Function {
    public static void main(String[] args) {
        addCommodity();
    }

    private static void addCommodity()
    {
        Scanner scn = new Scanner(System.in);
        System.out.println("添加商品名称：");
        String name = scn.next();
        System.out.println("添加商品价格：");
        double price = scn.nextDouble();
        System.out.println("添加商品数量：");
        int quality = scn.nextInt();
        Commodity c = new Commodity(name,price,quality);
    }

    private static void changeCommodity()
    {
        Scanner scn = new Scanner(System.in);
        System.out.println("输入更改商品的名称：");
        String name = scn.next();
        foundCommodity(name);

    }

    private static void foundCommodity(String name)
    {

    }
}
