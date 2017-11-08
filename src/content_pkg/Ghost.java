package content_pkg;

import java.util.ArrayList;

public class Ghost extends MoveableObject
{
	public String PREV_ACTION;
    public ArrayList<Integer> CURR_PATH = new ArrayList<Integer>();
    public ArrayList<Integer> FINAL_PATH = new ArrayList<Integer>();
    
	public static final String ANIMATION_TYPE = new String(Animation.GHOST_ANIMATION);
	
	public Ghost() {
		super(ANIMATION_TYPE);
	}
}
