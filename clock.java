import javafx.application.Application;
import javafx.scene.*;
import javafx.stage.*;
import javafx.scene.shape.*;
import javafx.scene.paint.*;

public class clock extends Application{
	public static void main(String[] args){
		launch(args);
	}
	@Override
	public void start(Stage stage){
		Group group = new Group();
		Scene scene = new Scene(group,800,800);
		/*
		Circle circle = new Circle();
		circle.setCenterX(400.0);
		circle.setCenterY(400.0);
		circle.setRadius(300.0);
		circle.setFill(Color.WHITE);
		circle.setStroke(Color.BLACK);
		circle.setStrokeWidth(4);
		*/
		
		for(int i = 0; i < 10; i++){
			Rectangle rect = new Rectangle();
			rect.setX(i*20);
			rect.setY(i*20);
			rect.setWidth(50);
			rect.setHeight(50);
		//	group.getChildren.add(rect);
		}
		//group.getChildren().add(circle);
		group.getChildren().add(rect);
		stage.setScene(scene);
		stage.show();
	}
}