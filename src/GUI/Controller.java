package GUI;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import opskrifter.Ingrediens;
import opskrifter.IngrediensMedNaeringsdetaljer;
import opskrifter.Opskrift;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Controller {

    @FXML
    private TextArea ingredienserTextArea;

    @FXML
    private Label titelLabel;

    @FXML
    private TextArea fremgangsmaadeTextArea;

    @FXML
    private Button indlaesButton;

    @FXML
    void indlaesNaeste(ActionEvent event) {

        Opskrift teOpskrift = new Opskrift("Te", "Put teen i kogende vand, vent 2 minutter og server.", 5, 0);
        teOpskrift.addIngrediens("Te", 1);
        teOpskrift.addIngrediens("Vand", 0);
        Ingrediens citron = new IngrediensMedNaeringsdetaljer("Citron", 10, 10, 5, 10);
        teOpskrift.addIngrediens(citron);


        titelLabel.setText(teOpskrift.getNavn());
        fremgangsmaadeTextArea.setText(teOpskrift.getFremgangsmaade());
        ingredienserTextArea.setText(teOpskrift.visIngredienserTilGUI());

    }

    public void gemOpskrift(ActionEvent actionEvent) {
        String ingredienser = ingredienserTextArea.getText();
        String fremgangsmaade = fremgangsmaadeTextArea.getText();
        File file = new File("opskrift.txt");
        try {
            FileWriter fileWriter = new FileWriter(file, true);
            fileWriter.append("Opskrift \n");
            fileWriter.append(ingredienser + "\n");
            fileWriter.append(fremgangsmaade+ "\n----------------------\n");
            fileWriter.close();
        } catch (IOException e) {
            System.out.println("Filen opskrift.txt kan ikke åbnes.");
            e.printStackTrace();
        }
    }
}
