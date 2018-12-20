package towerDefenseProject;

public interface State {
	
	
	public void enter();
	
	
	//3 methods that will be repeated in game loop
	public void processInput();
	
	
	public void update(float time);
	
	
	public void render(Graphics2D graphics, Matrix3x3f matrix);
	
	
	
	public void exit();

}
