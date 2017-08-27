/**
 * Created by apple on 2017/8/27.
 */
public class Interface {
    public static void printInterface()
    {
        System.out.println("****************************************\n");
        printContent();
        System.out.println("****************************************");
        System.out.println("请选择，输入数字或者按0退出");
    }

    private static void printContent()
    {

    }

    private static void mainInterface()
    {
        System.out.println("              1.商品维护\n");
        System.out.println("              2.前台收银\n");
        System.out.println("              3.商品管理\n");
    }
    
    private static void commodityMaintenanceInterface()
    {
        System.out.println("              1.添加商品\n");
        System.out.println("              2.更改商品\n");
        System.out.println("              3.删除商品\n");
        System.out.println("              4.显示所有商品\n");
        System.out.println("              5.查询商品\n");
    }

    private static void commodityManagementInterface()
    {
        System.out.println("              1.列出当日卖出商品列表\n");
        System.out.println("              2.售货员管理\n");
    }

    private static void salesclerkManagementInterface()
    {
        System.out.println("              1.添加售货员\n");
        System.out.println("              2.更改售货员\n");
        System.out.println("              3.删除售货员\n");
        System.out.println("              4.显示所有售货员\n");
        System.out.println("              5.查询售货员\n");
    }


}