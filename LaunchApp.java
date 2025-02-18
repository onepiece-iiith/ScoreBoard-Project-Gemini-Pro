```java
import FXML_FIle.LoadingPageControl;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.scene.image.Image;
import javafx.stage.Stage;
import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import DatabaseFile.DatabaseConnection;

public class LaunchApp extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws IOException, InterruptedException {
        // ... (rest of the code)
        DatabaseConnection dbConnection = new DatabaseConnection("your_database", "your_username", "your_password"); // Instantiate connection object

        try {
            Connection connection = dbConnection.getConnection(); 
            dbConnection.createTables(connection);
        } catch (Exception e) {
            Alert alert = new Alert(Alert.AlertType.ERROR, "Database error:" + e.getMessage(), ButtonType.OK);
            alert.showAndWait();
        }
    }
    // ... (rest of the methods)
}
```