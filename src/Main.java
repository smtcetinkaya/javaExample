import java.sql.*;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws SQLException
    {

    }
    public static void sql_select() throws SQLException {
        Connection connection = null;
        DbHelper dbHelper = new DbHelper();
        Statement statement = null;
        ResultSet resultSet;
        try
        {
            connection = dbHelper.getConnection();
            statement = connection.createStatement();
            resultSet = statement.executeQuery("select * from world.country;\n");
            ArrayList <Country> arrayList = new ArrayList<>();
            while (resultSet.next())
            {
                arrayList.add(new Country(
                        resultSet.getString("Code"),
                        resultSet.getString("Name"),
                        resultSet.getString("Continent"),
                        resultSet.getString("Region")));
            }
            System.out.println(arrayList.size());
        }
        catch (SQLException e)
        {
            dbHelper.showErrorMessage(e);
        }
        finally
        {
            connection.close();
        }

    }

    public static void sql_insert() throws SQLException {
        Connection connection = null;
        DbHelper dbHelper = new DbHelper();
        PreparedStatement statement = null;
        ResultSet resultSet;
        try
        {
            connection = dbHelper.getConnection();
            statement = connection.prepareStatement
                    ("insert into city (Name,CountryCode,District,Population) values ('Düzce','TUR','Düzce',81000);\n");
            statement.executeUpdate();
            System.out.println("OK!");
        }
        catch (SQLException e)
        {
            dbHelper.showErrorMessage(e);
        }
        finally
        {
            statement.close();
            connection.close();
        }

    }
    public static void sql_update() throws SQLException {
        Connection connection = null;
        DbHelper dbHelper = new DbHelper();
        PreparedStatement statement = null;
        ResultSet resultSet;
        try
        {
            connection = dbHelper.getConnection();
            statement = connection.prepareStatement
                    ("update world.city set population = 81811,district = 'Black Sea'  where id = 4081;\n");
            statement.executeUpdate();
            System.out.println("OK!");
        }
        catch (SQLException e)
        {
            dbHelper.showErrorMessage(e);
        }
        finally
        {
            statement.close();
            connection.close();
        }

    }

    public static void sql_delete() throws SQLException {
        Connection connection = null;
        DbHelper dbHelper = new DbHelper();
        PreparedStatement statement = null;
        ResultSet resultSet;
        try
        {
            connection = dbHelper.getConnection();
            statement = connection.prepareStatement
                    ("delete from city where id = 4081;\n");
            statement.executeUpdate();
            System.out.println("OK!");
        }
        catch (SQLException e)
        {
            dbHelper.showErrorMessage(e);
        }
        finally
        {
            statement.close();
            connection.close();
        }

    }
}