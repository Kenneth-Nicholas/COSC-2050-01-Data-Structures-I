import java.sql.*;

public class DBTesterApp {

    private static Connection connection;

    public static void main(String args[]) {        
        // open connection
        try {
            String dbUrl = "jdbc:sqlite:products.sqlite";
            connection = DriverManager.getConnection(dbUrl);        
        } catch (SQLException e) {
            System.err.println(e);
            return;
        }        
        
        // select data from database
        printProducts();
        printFirstProduct();
        printProductByCode("jsp");

        // modify data in the database
        Product p = new Product("test", "Test Product", 49.50);
        insertProduct(p);
        printProducts();
        deleteProduct(p);
        printProducts();

        // close connection
        try {
            connection.close();
        } catch (SQLException e) {
            System.out.println(e);            
        }
    }

    public static void printProducts() {
        try (Statement statement = connection.createStatement();
             ResultSet rs = statement.executeQuery("SELECT * FROM Products")) {
            Product p;

            System.out.println("Product list:");
            while (rs.next()) {
                String code = rs.getString("ProductCode");
                String description = rs.getString("Description");
                double price = rs.getDouble("Price");

                p = new Product(code, description, price);

                printProduct(p);
            }
            System.out.println();
        } catch (SQLException e) {
            System.out.println(e);
        }
    }

    public static void printFirstProduct() {
        Product p = new Product();

        // add code that prints the record for the first product in the Products table
        System.out.println("First product:");
        printProduct(p);
        System.out.println();
    }

    public static void printProductByCode(String productCode) {
        Product p = new Product();

        // add code that prints the product with the specified code
        System.out.println("Product by code: " + productCode);
        printProduct(p);
        System.out.println();
    }

    public static void insertProduct(Product p) {
        System.out.println("Insert test: ");

        // add code that inserts the specified product into the database
        // if a product with the specifed code already exists, display an error message
        printProduct(p);
        System.out.println();
    }

    private static void deleteProduct(Product p) {
        System.out.println("Delete test: ");

        // add code that deletes the specified product from the database
        // if a product with the specified code doesn't exist, display an error message
        printProduct(p);
        System.out.println();
    }

    // use this method to print a Product object on a single line
    private static void printProduct(Product p) {
        String productString
                = StringUtil.padWithSpaces(p.getCode(), 12)
                + StringUtil.padWithSpaces(p.getDescription(), 38)
                + p.getFormattedPrice();

        System.out.println(productString);
    }
}