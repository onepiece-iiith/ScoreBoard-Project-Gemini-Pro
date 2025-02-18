package DatabaseFile;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class DatabaseNames {

    private List<String> databaseNames;

    public DatabaseNames() {
        databaseNames = new ArrayList<>();
        loadDatabaseNames();
    }

    public void addDatabaseName(String databaseName) {
        databaseNames.add(databaseName);
        saveDatabaseNames();
    }

    public List<String> getDatabaseNames() {
        return databaseNames;
    }

    private void loadDatabaseNames() {
        try {
            List<String> names = Files.readAllLines(Paths.get("/ScoreBoard/data/databaseNames.txt"));
            databaseNames = new ArrayList<>(names);
        } catch (IOException e) {
            // Handle exception appropriately, e.g., create an empty list or log the error
            System.err.println("Error loading database names: " + e.getMessage());
            databaseNames = new ArrayList<>();
        }
    }

    private void saveDatabaseNames() {
        try {
            Files.write(Paths.get("/ScoreBoard/data/databaseNames.txt"), databaseNames);
        } catch (IOException e) {
            // Handle exception appropriately, e.g., log the error.
            System.err.println("Error saving database names: " + e.getMessage());
        }
    }



}