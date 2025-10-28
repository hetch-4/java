import javafx.application.Application;
import javafx.scene.*;
import javafx.scene.paint.Color;
import javafx.scene.paint.PhongMaterial;
import javafx.scene.shape.Box;
import javafx.scene.transform.Rotate;
import javafx.stage.Stage;
import javafx.animation.AnimationTimer;

public class Main extends Application {

    public void start(Stage stage) {
        // Create a 3D box (cube)
        Box box = new Box(150, 150, 150);

        // Add material (color)
        PhongMaterial material = new PhongMaterial();
        material.setDiffuseColor(Color.DODGERBLUE);
        material.setSpecularColor(Color.LIGHTBLUE);
        box.setMaterial(material);

        // Rotate transforms
        Rotate rotateX = new Rotate(0, Rotate.X_AXIS);
        Rotate rotateY = new Rotate(0, Rotate.Y_AXIS);
        box.getTransforms().addAll(rotateX, rotateY);

        // Animation for rotation
        new AnimationTimer() {
            double angleX = 0;
            double angleY = 0;
            @Override
            public void handle(long now) {
                angleX += 0.5;
                angleY += 0.7;
                rotateX.setAngle(angleX);
                rotateY.setAngle(angleY);
            }
        }.start();

        // Set up camera
        PerspectiveCamera camera = new PerspectiveCamera(true);
        camera.setTranslateZ(-500);

        // Add box to scene
        Group root = new Group(box);
        Scene scene = new Scene(root, 600, 600, true);
        scene.setFill(Color.BLACK);
        scene.setCamera(camera);

        stage.setTitle("JavaFX 3D Cube Example");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
