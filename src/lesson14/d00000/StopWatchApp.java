package lesson14.d00000;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

import java.util.Timer;
import java.util.TimerTask;

/**
 * # タイトル
 *
 * ストップウォッチ
 *
 * # 説明
 *
 * スタートボタンを押すと計測がスタートする。
 * 0.1秒間隔で経過時間を表示する。
 * ストップボタンを押すと計測がストップする。
 * 再度スタートボタンを押すと、経過時間が0にリセットされて計測が開始される。
 *
 * # 工夫した点
 *
 * スタートボタンを連続で押しても誤動作しないように、重複して計測しないようにした。
 * java.util.Timerクラスを利用して定期実行を行っている。
 * TimerTaskクラスの継承やRunnableインターフェースの実装には無名クラスで行った。
 *
 */
public class StopWatchApp extends Application implements EventHandler<ActionEvent> {
    private Label label;
    private Button startButton;
    private Button stopButton;
    private int count;
    private Timer timer;

    @Override
    public void start(Stage primaryStage) throws Exception {
        // ラベル
        label = new Label();
        label.setText("0.0");
        label.relocate(10, 10);

        // スタートボタン
        startButton = new Button();
        startButton.setText("スタート");
        startButton.relocate(10, 40);
        startButton.setOnAction(this);

        // リセットボタン
        stopButton = new Button();
        stopButton.setText("ストップ");
        stopButton.relocate(10, 70);
        stopButton.setOnAction(this);

        // ペイン（レイアウト）
        Pane pane = new Pane();
        pane.getChildren().add(label); // ペインにラベルを追加
        pane.getChildren().add(startButton); // ペインにカウントボタンを追加
        pane.getChildren().add(stopButton); // ペインにリセットボタンを追加

        // シーン
        Scene scene = new Scene(pane, 150, 200);
        primaryStage.setScene(scene); // シーンにペインをセット

        // 最初はこれだけ
        primaryStage.setTitle("ストップウォッチ");
        primaryStage.show();
    }

    /**
     * ボタンがクリックされた時に実行される
     */
    @Override
    public void handle(ActionEvent event) {
        Object source = event.getSource(); // イベントの発生源となっているインスタンスを取得する
        if (source.equals(startButton)) {
            if (timer == null) {
                count = 0;
                timer = new Timer();
                timer.scheduleAtFixedRate(new TimerTask() {
                    @Override
                    public void run() {
                        double sec = count * 0.1;
                        Platform.runLater(new Runnable() {
                            @Override
                            public void run() {
                                label.setText(String.format("%.1f", sec));
                            }
                        });
                        count++;
                    }
                },0, 100);
            }
        } else if (source.equals(stopButton)) {
            if (timer != null) {
                timer.cancel();
                timer = null;
            }
        }
    }
}
