import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.VBox;
import javafx.scene.layout.HBox;
import javafx.geometry.Pos;
import javafx.geometry.Insets;
import javafx.scene.control.Button;
import java.util.Random;


public class Main extends Application
{
   public static void main(String[] args)
   {
      // Launch the application.
      launch(args);
   }
   
   @Override
   public void start(Stage primaryStage)
   {
   
      // Load the coin images.
      Image headImage = new Image("Heads1.png");
      Image tailImage = new Image("Tails1.png");
 
      
      // Create the ImageView control.
      ImageView coinView = new ImageView();
      coinView.setFitWidth(200);
      coinView.setFitHeight(200);
      HBox hbox = new HBox(coinView);
      
      // Create the tossButton control.
      Button tossButton = new Button("Toss");
      hbox.setAlignment(Pos.CENTER);
         

      
      // Register the event handler.
      tossButton.setOnAction(e ->
      {
         // Create a Random object.

         Random random = new Random();
         // Get a random value, 0 or 1.
         int result = random.nextInt(2);

         
         // Set the coin image.
         // 0 = "heads" or 1 = "tails"
         if(result == 0){
            coinView.setImage(headImage);
         }
         else{
            coinView.setImage(tailImage);
         }

      });
      
      // Put everything into a VBox
      VBox vbox = new VBox(20, hbox, tossButton);
      vbox.setAlignment(Pos.CENTER);
      vbox.setPadding(new Insets(20));
      
      // Add the main VBox to a scene.
      Scene scene = new Scene(vbox,400,400);
      
      // Set the scene to the stage aand display it.
      primaryStage.setTitle("Coin Toss Simulator");
      primaryStage.setScene(scene);
      primaryStage.show();

   }
}