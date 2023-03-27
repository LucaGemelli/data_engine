package com.data.code;

import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvValidationException;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

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
        List<File> files = new ArrayList<>();
        files.add(new File("src/main/java/com/data/code/drivers.csv"));
        files.add(new File("src/main/java/com/data/code/results.csv"));

        for (File file:files) {
            CSVReader reader = new CSVReader(new FileReader(file));
            String[] line;
            line = reader.readNext();
            int quantityColumns = line.length;
            String columns = asList(line).toString().replace("[", "(").replace("]", ")").replaceAll("([a-z])([A-Z])", "$1_$2").toUpperCase();
            String questionMarks = "?, ".repeat(quantityColumns -1).concat("?");
            String tableName = findTableName(file.getName());
            PreparedStatement stmt = conn.prepareStatement("INSERT INTO " + tableName + columns + " VALUES(" + questionMarks + ")");
            while ((line = reader.readNext()) != null) {
                for(int i=0; i < quantityColumns; i++) {
                    stmt.setString(i+1, line[i]);
                }
                stmt.executeUpdate();
            }
            reader.close();
            stmt.close();
        }

        conn.close();
    }

    private static String findTableName(String fileName) {
        switch (fileName) {
            case "drivers.csv":
                return "PILOT ";
            case "results.csv":
                return "RESULT ";
            default:
                throw new RuntimeException();
        }
    }

}
