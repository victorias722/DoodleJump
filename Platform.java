import javafx.scene.Node;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

public class Platform {
    private Rectangle rect;
    private String s;
	  private boolean _isbouncy = false;
	  private boolean _isdisappeared = false;

    public Platform(double x, double y){
        rect = new Rectangle(Constants.PLATFORM_WIDTH,Constants.PLATFORM_HEIGHT,Color.RED);
        rect.setX(x);
        rect.setY(y);
    }
  
    public double getXLoc(){
		return rect.getX();
	  }
  
	  public double getYLoc(){
		    return rect.getY();
	  }

	  public void makedisappeared(){
		    _isdisappeared = true;
		    rect.setFill(Color.PURPLE);
	  }
	  public boolean isdisappeared(){
		    return _isdisappeared;
	  }

	  public void makebouncy(){
		    _isbouncy = true;
	  }

	  public boolean isbouncy(){
		    return _isbouncy;
	  }
	  public void setXLoc(double h){
		    rect.setX(h);
	  }
  
	  public void setYLoc(double v){
		    rect.setY(v);
	  }

    public void getColor(){
		    rect.getFill();
	  }

    public void setColor(Color color){
		    rect.setFill(color);
	  }

    public Node getNode(){
		    return rect;
	  }

}
