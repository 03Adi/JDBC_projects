import java.sql.*;
public class read{
    public static void  main(String arg[]) throws ClassNotFoundException{

        String url="jdbc:mysql://localhost:3306/company";
        String username="root";
        String password="aditya@2003#03";
        String query="Select * from employee";

        try {
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("Drivers loaded succesfully: ");
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }

        try{
            Connection con=DriverManager.getConnection(url,username,password);
            System.out.println("connected succesfully");
            Statement stm=con.createStatement();
            ResultSet rs=stm.executeQuery(query);
            while(rs.next()){
                int id=rs.getInt("id");
                String name=rs.getString("name");
                String post =rs.getString("post");
               String salary=rs.getString("salary");

                System.out.println("*************");
                System.out.println();
                System.out.println("ID: "+id);
                System.out.println("Name: "+name);
                System.out.println("POST: "+post);
               System.out.println("Salary: "+salary);
            }

            System.out.println();

            rs.close();
            stm.close();
            con.close();

            System.out.println("conncetion close succesfully: *********");


        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}