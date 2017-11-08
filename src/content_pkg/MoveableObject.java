package content_pkg;

public class MoveableObject
{
	public Vector position = null;
    public Vector direction = null;
    public Vector view_direction = null;
    public int speed = 5;
    public Animation animation = null;
    
    public MoveableObject(){
    	init(Animation.GHOST_ANIMATION);
    }
    
    public MoveableObject(String animation_type){
    	init(animation_type);
    }
    
	private void init(String animation_type){
		position = new Vector(0, 0);
		direction = new Vector(0,0);
		view_direction = new Vector(0,0);
		speed = 3;
		animation = new Animation(animation_type);
	}
}