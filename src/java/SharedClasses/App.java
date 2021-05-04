/*
 * Runs the CSV parser to update the database
 */
package SharedClasses;


import SharedClasses.CSVParse;
import java.net.MalformedURLException;
import java.sql.SQLException;

/**
 *
 * @author RIVER
 */
public class App {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws MalformedURLException, SQLException {
        CSVParse parseDataIntoDatabase = new CSVParse();
    }
    
}
