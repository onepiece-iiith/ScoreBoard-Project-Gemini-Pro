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

//Encapsulate team and player data
class DataManager {
    private ArrayList<String> teamList;
    private ArrayList<String> playerList;

    public DataManager(ArrayList<String> teamList, ArrayList<String> playerList) {
        this.teamList = teamList;
        this.playerList = playerList;
    }

    public ArrayList<String> getTeamList() {return teamList;}
    public ArrayList<String> getPlayerList(){return playerList;}
}

public class LaunchApp extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws IOException, InterruptedException {

        // ... (rest of the LaunchApp class)
        //Example usage

        DataManager dataManager = new DataManager(getTeamList(), getPlayerList());
        //use dataManager.getTeamList() and DataManager.getPlayerList()
        // ...



    }

    // ... (rest of the LaunchApp class)



    public ArrayList<String> getTeamList() throws IOException {

        ArrayList<String> list = new ArrayList<>();
        //Implement Logic to read from file and add to ArrayList
        // ...
        return list;
    }


    public ArrayList<String> getPlayerList() throws IOException {

        ArrayList<String> list = new ArrayList<>();
        //Implement Logic to read from file and add to ArrayList
        // ...
        return list;
    }


    // ... (rest of the LaunchApp class)