package com.data.code;

import com.opencsv.exceptions.CsvValidationException;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.IOException;
import java.sql.SQLException;

import static com.data.code.config.FileReaderConfig.readFiles;
import static org.springframework.boot.SpringApplication.run;

@SpringBootApplication
public class EngineApplication {

    public static void main(String[] args) throws CsvValidationException, SQLException, IOException {
        run(EngineApplication.class, args);
        readFiles();
    }
}
