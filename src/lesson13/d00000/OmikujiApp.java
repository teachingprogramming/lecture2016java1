package lesson13.d00000;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class OmikujiApp extends Application implements EventHandler<ActionEvent> {
    private TextField nameTextField;
    private Button divineButton;
    private Label resultLabel;
    @Override
    public void start(Stage primaryStage) throws Exception {
        // テキストフィールド（名前入力）
        nameTextField = new TextField();
        nameTextField.setText("名前");
        nameTextField.relocate(10, 10);

        // ボタン（占う）
        divineButton = new Button();
        divineButton.setText("占う");
        divineButton.relocate(10, 40);
        divineButton.setOnAction(this);

        // ラベル（結果表示）
        resultLabel = new Label();
        resultLabel.setText("結果がここに表示されます。");
        resultLabel.relocate(10, 70);

        // ペイン（レイアウト）
        Pane pane = new Pane();
        pane.getChildren().add(nameTextField);
        pane.getChildren().add(divineButton);
        pane.getChildren().add(resultLabel);

        // シーン
        Scene scene = new Scene(pane, 250, 200);
        primaryStage.setScene(scene); // シーンにペインをセット

        primaryStage.setTitle("占い");
        primaryStage.show();
    }

    @Override
    public void handle(ActionEvent event) {
        int rand = (int)Math.floor(Math.random()*3.0); // 0, 1, 2
        String result;
        if (rand == 0) {
            result = "大吉";
        } else if (rand == 1) {
            result = "吉";
        } else { // rand == 0
            result = "凶";
        }
        String name = nameTextField.getText();
        resultLabel.setText(name + "さんの今日の運勢は" + result);
    }
}
