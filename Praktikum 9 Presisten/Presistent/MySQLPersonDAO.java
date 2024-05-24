import java.sql.Connection;
import java.sql.DriverManager;

public class MySQLPersonDAO implements PersonDAO {
    public void savePerson(Person person) throws Exception {
        String name = person.getName();
        // Membuat koneksi, namadb, user, password menyeduaikan
        Class.forName("com.mysql.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/pbo", "root", "root");
        // kerjakan mysql query
        String query = "INSERT INTO person(name) VALUES ('" + name + "')";
        System.out.println(query);
        java.sql.Statement s = con.createStatement();
        s.executeUpdate(query);
        con.close();
    }
}