package com.data.code;

import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvValidationException;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import static java.sql.DriverManager.getConnection;
import static java.util.Arrays.asList;
import static org.springframework.boot.SpringApplication.run;

@SpringBootApplication
public class EngineApplication {

    public static void main(String[] args) throws SQLException, IOException, CsvValidationException {
        run(EngineApplication.class, args);
        readFiles();
    }

    private static void readFiles() throws SQLException, IOException, CsvValidationException {
        Connection conn = getConnection("jdbc:h2:mem:testdb2", "sa", "password");
        CSVReader reader = new CSVReader(new FileReader("src/main/java/com/data/code/drivers.csv"));
        String[] line;
        line = reader.readNext();
        String columns = asList(line).toString().replace("[", "(").replace("]", ")").replaceAll("([a-z])([A-Z])", "$1_$2").toUpperCase();
        PreparedStatement stmt = conn.prepareStatement("INSERT INTO PILOT" + columns + "VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?)");
        while ((line = reader.readNext()) != null) {
            stmt.setString(1, line[0]);
            stmt.setString(2, line[1]);
            stmt.setString(3, line[2]);
            stmt.setString(4, line[3]);
            stmt.setString(5, line[4]);
            stmt.setString(6, line[5]);
            stmt.setString(7, line[6]);
            stmt.setString(8, line[7]);
            stmt.setString(9, line[8]);
            stmt.executeUpdate();
        }
        reader.close();
        stmt.close();
        conn.close();
    }

}
