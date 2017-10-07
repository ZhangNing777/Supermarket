import java.sql.*;
import java.util.Scanner;

/**
 * Created by apple on 2017/10/7.
 */
public class Try {
    private static Connection conn;
    private static PreparedStatement ps;
    private static ResultSet rs;
    private static ResultSetMetaData rsmd;

    public static void main(String[] rgs) {
        Derby.loadDriver();
        try {
            conn = Derby.createDatabaseAndGetConnection("ch50", "", "");

            if (Derby.isTableExists("GOODS", conn)) {
                ps = conn.prepareStatement("drop table GOODS");
                ps.execute();
            }

            ps = conn.prepareStatement("create table GOODS(GID int,GNAME varchar(50),GPRICE int,GNUM int)");
            ps.execute();

            ps = conn.prepareStatement("INSERT into GOODS values(?,?,?,?) ");
            ps.setInt(1,1);
            ps.setString(2, "Apple");
            ps.setInt(3, 100);
            ps.setInt(4, 20);
            ps.executeUpdate();
            ps.setInt(1,2);
            ps.setString(2, "Agg");
            ps.setInt(3, 1000);
            ps.setInt(4, 50);
            ps.executeUpdate();
            ps.setInt(1,3);
            ps.setString(2, "A");
            ps.setInt(3, 102);
            ps.setInt(4, 26);
            ps.executeUpdate();
            Scanner s = new Scanner(System.in);
            int a = s.nextInt();
            String b = s.next();
            int c = s.nextInt();
            int d = s.nextInt();
            ps.setInt(1,a);
            ps.setString(2, b);
            ps.setInt(3, c);
            ps.setInt(4, d);
            ps.executeUpdate();

            ps=conn.prepareStatement("select * from GOODS");
            rs=ps.executeQuery();

            rsmd=rs.getMetaData();
            int numberOfColumns=rsmd.getColumnCount();
            String[] columnNames = new String[numberOfColumns];
            String[] columnTypeNames=new String[numberOfColumns];
            int[] precisions=new int[numberOfColumns];
            for(int i=0;i<numberOfColumns;i++)
            {
                columnNames[i] = rsmd.getColumnName(i+1);
                columnTypeNames[i] = rsmd.getColumnTypeName(i+1);
                precisions[i] = rsmd.getPrecision(i+1);
                System.out.println(columnNames[i]+":"+columnTypeNames[i]+"("+precisions[i]+")");
            }

            for(int i=0;i<numberOfColumns;i++){
                String columnName=columnNames[i];
                if(columnName.length()>precisions[i]){
                    columnName=columnName.substring(0, precisions[i]);
                }
                System.out.printf("%-"+precisions[i]+"s|",columnName);
            }
            System.out.println();
            while(rs.next()){
                for(int i=0;i<numberOfColumns;i++){
                    System.out.printf("%-"+precisions[i]+"s|",rs.getObject(i+1));
                }
                System.out.println();
            }

            rs.close();
            ps.close();
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        finally{
            // perform a clean database closing
            Derby.shutdownDatabase("ch50");
            Derby.shutdownAll();
        }
    }
}
