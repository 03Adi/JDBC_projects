import java.sql.*;
public class update {
    public static void main(String[] args) {

        String url="jdbc:mysql://localhost:3306/information";
        String username="root";
        String password="aditya@2003#03";
        String query="UPDATE students\n"+
                "SET name='Aditya Prakash Pandey', age='20'\n"+
                "WHERE id=3";

//        try{
////            Class.forName("com.mysql.jdbc.Driver");
//            System.out.println("Driver loaded succesfully ");
//        }
//        catch(Exception e){
//            System.out.println(e.getMessage());
//        }

        try{
            Connection con=DriverManager.getConnection(url,username,password);
            System.out.println("Driver stablished successfully");
            Statement stmt =con.createStatement();
            int roweffect=stmt.executeUpdate(query);

            if(roweffect>0){
                System.out.println("updation successful ");
            }
            else{
                System.out.println("updation failed");
            }
            stmt.close();
            con.close();

            System.out.println("conncetion close !!");
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
    }

}
