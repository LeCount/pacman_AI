package content_pkg;

import java.awt.Image;

import javax.swing.ImageIcon;

public class Animation {
	
	public static final int NUMOF_IMG = 3;
	public static final int ANIMATION_DELAY = 8;
	
	public static final String GHOST_ANIMATION = new String("GHOST");
	public static final String PACMAN_ANIMATION = new String("PACMAN");
	
	private static final String GHOST_HUNT_IMG_SRC = new String("images/ghost_hunt/");
	private static final String GHOST_INTERCEPT_IMG_SRC = new String("images/ghost_intercept/");
	private static final String GHOST_RANDOM_IMG_SRC = new String("images/ghost_random/");
	private static final String PACMAN_IMG_SRC = new String("images/pacman/");
	private static final String OTHER_IMG_SRC = new String("images/other/");
	
	public int count = ANIMATION_DELAY;
	public int direction = 1;
	public int position = 1;
	
    private Image base = null;
    private Image[] up = new Image[NUMOF_IMG];
    private Image[] down = new Image[NUMOF_IMG];
    private Image[] left = new Image[NUMOF_IMG];
    private Image[] right = new Image[NUMOF_IMG];
    
    public Animation(String animation_type){
    	
    	init(animation_type);
    }

	private void init(String animation_type) {
		
		loadImages(animation_type);
	}
	
	public Image base(){
		return base;
	}
	
	
	public Image up(int index){
		
		if (index < 0 || index > NUMOF_IMG - 1) {
			return up[0];
		}
		else {
			return up[index];
		}
	}
	
	public Image down(int index){
		
		if (index < 0 || index > NUMOF_IMG - 1) {
			return down[0];
		}
		else {
			return down[index];
		}
	}
	
	public Image left(int index){
		
		if (index < 0 || index > NUMOF_IMG - 1) {
			return left[0];
		}
		else {
			return left[index];
		}
	}
	
	public Image right(int index){
		
		if (index < 0 || index > NUMOF_IMG - 1) {
			return right[0];
		}
		else {
			return right[index];
		}
	}
	
	private void loadImages(String animation_type) {
		
		if (animation_type.equals(GHOST_ANIMATION)) {
			initGhost();
		}
		else if (animation_type.equals(PACMAN_ANIMATION)){
			initPacman();
		}
		else {
			initOther();
		}
	}

	private void initGhost() {
		
        base = 		new ImageIcon(GHOST_HUNT_IMG_SRC + "laughing.png").getImage();
        
        up[0] = 	new ImageIcon(GHOST_HUNT_IMG_SRC + "laughing.png").getImage();
        up[1] = 	new ImageIcon(GHOST_HUNT_IMG_SRC + "angry1.png").getImage();
        up[2] = 	new ImageIcon(GHOST_HUNT_IMG_SRC + "angry2.png").getImage();
        
        down[0] = 	new ImageIcon(GHOST_HUNT_IMG_SRC + "laughing.png").getImage();
        down[1] = 	new ImageIcon(GHOST_HUNT_IMG_SRC + "angry1.png").getImage();
        down[2] = 	new ImageIcon(GHOST_HUNT_IMG_SRC + "angry2.png").getImage();
        
        left[0] = 	new ImageIcon(GHOST_HUNT_IMG_SRC + "laughing.png").getImage();
        left[1] = 	new ImageIcon(GHOST_HUNT_IMG_SRC + "angry1.png").getImage();
        left[2] = 	new ImageIcon(GHOST_HUNT_IMG_SRC + "angry2.png").getImage();
        
        right[0] = 	new ImageIcon(GHOST_HUNT_IMG_SRC + "laughing.png").getImage();
        right[1] = 	new ImageIcon(GHOST_HUNT_IMG_SRC + "angry1.png").getImage();
        right[2] = 	new ImageIcon(GHOST_HUNT_IMG_SRC + "angry2.png").getImage();
	}

	private void initPacman() {
		
        base = 		new ImageIcon(PACMAN_IMG_SRC + "base.png").getImage();
        
        up[0] = 	new ImageIcon(PACMAN_IMG_SRC + "up1.png").getImage();
        up[1] = 	new ImageIcon(PACMAN_IMG_SRC + "up2.png").getImage();
        up[2] = 	new ImageIcon(PACMAN_IMG_SRC + "up3.png").getImage();
        
        down[0] = 	new ImageIcon(PACMAN_IMG_SRC + "down1.png").getImage();
        down[1] = 	new ImageIcon(PACMAN_IMG_SRC + "down2.png").getImage();
        down[2] = 	new ImageIcon(PACMAN_IMG_SRC + "down3.png").getImage();
        
        left[0] = 	new ImageIcon(PACMAN_IMG_SRC + "left1.png").getImage();
        left[1] = 	new ImageIcon(PACMAN_IMG_SRC + "left2.png").getImage();
        left[2] = 	new ImageIcon(PACMAN_IMG_SRC + "left3.png").getImage();
        
        right[0] = 	new ImageIcon(PACMAN_IMG_SRC + "right1.png").getImage();
        right[1] = 	new ImageIcon(PACMAN_IMG_SRC + "right2.png").getImage();
        right[2] = 	new ImageIcon(PACMAN_IMG_SRC + "right3.png").getImage();
	}
	
	private void initOther() {

        base = 		new ImageIcon(OTHER_IMG_SRC + "other.png").getImage();
        
        up[0] = 	new ImageIcon(OTHER_IMG_SRC + "other.png").getImage();
        up[1] = 	new ImageIcon(OTHER_IMG_SRC + "other.png").getImage();
        up[2] = 	new ImageIcon(OTHER_IMG_SRC + "other.png").getImage();
        
        down[0] = 	new ImageIcon(OTHER_IMG_SRC + "other.png").getImage();
        down[1] = 	new ImageIcon(OTHER_IMG_SRC + "other.png").getImage();
        down[2] = 	new ImageIcon(OTHER_IMG_SRC + "other.png").getImage();
        
        left[0] = 	new ImageIcon(OTHER_IMG_SRC + "other.png").getImage();
        left[1] = 	new ImageIcon(OTHER_IMG_SRC + "other.png").getImage();
        left[2] = 	new ImageIcon(OTHER_IMG_SRC + "other.png").getImage();
        
        right[0] = 	new ImageIcon(OTHER_IMG_SRC + "other.png").getImage();
        right[1] = 	new ImageIcon(OTHER_IMG_SRC + "other.png").getImage();
        right[2] = 	new ImageIcon(OTHER_IMG_SRC + "other.png").getImage();
	}
}