public class BasicConnectionWithResources
{
    public static void main(String[] args)
    String url =
            "http://localhost/phpmyadmin/index.php?route=/database/structure&server=1&db=formulario";
    String username = "Neithan_@";
    String password = "Neithan-1031540860";
    String sql = "SELECT * FROM
    my_app.users_tbl";
        try (Connection conn =
        DriverManager.getConnection(url,
                username, password);
    Statement stmt =
            conn.createStatement();
    ResultSet rs =
            stmt.executeQuery(sql)) {
    while (rs.next()) {

        System.out.println(rs.getString("user_fir
                stname"));

                System.out.println(rs.getString("user_las
                        tname"));
    }
} catch (SQLException e) {
    e.printStackTrace();
} // end try-catch
} // main
} // BasicConnectionWithResources
        {

        }