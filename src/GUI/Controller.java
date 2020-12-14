package GUI;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import opskrifter.Ingrediens;
import opskrifter.IngrediensMedNaeringsdetaljer;
import opskrifter.Opskrift;

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

}
