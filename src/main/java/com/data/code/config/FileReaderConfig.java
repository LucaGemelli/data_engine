package com.data.code.config;

import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvValidationException;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import static java.sql.DriverManager.getConnection;
import static java.util.Arrays.asList;
import static com.data.code.model.enumeration.TableName.*;

public class FileReaderConfig {

    public static void readFiles() throws SQLException, IOException, CsvValidationException {
        Connection conn = getConnection("jdbc:h2:mem:testdb2", "sa", "password");
        for (File file : getFiles()) {
            CSVReader reader = new CSVReader(new FileReader(file));
            String[] line = reader.readNext();
            int quantityColumns = line.length;
            String tableName = getTableName(file.getName()) + " ";
            PreparedStatement stmt = conn.prepareStatement("INSERT INTO " + tableName + getColumns(line) + " VALUES(" + getQuestionMarks(quantityColumns) + ")");
            while ((line = reader.readNext()) != null) {
                for (int i = 0; i < quantityColumns; i++) {
                    stmt.setString(i + 1, line[i]);
                }
                stmt.executeUpdate();
            }
            reader.close();
            stmt.close();
        }
        conn.close();
    }

    private static List<File> getFiles() {
        return asList(
                new File("src/main/resources/database-csv/drivers.csv"),
                new File("src/main/resources/database-csv/results.csv"),
                new File("src/main/resources/database-csv/driver_standings.csv"),
                new File("src/main/resources/database-csv/circuits.csv")
        );
    }

    private static String getTableName(String fileName) {
        switch (fileName) {
            case "drivers.csv":
                return PILOT.getName();
            case "results.csv":
                return RESULT.getName();
            case "driver_standings.csv":
                return PILOT_STANDINGS.getName();
            case "circuits.csv":
                return CIRCUIT.getName();
            default:
                throw new RuntimeException();
        }
    }

    private static String getColumns(String[] line) {
        return asList(line).toString().replace("[", "(").replace("]", ")").replaceAll("([a-z])([A-Z])", "$1_$2").toUpperCase();
    }

    private static String getQuestionMarks(int quantityColumns) {
        return "?, ".repeat(quantityColumns - 1).concat("?");
    }
}
