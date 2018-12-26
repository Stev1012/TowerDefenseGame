
public interface State {
	public void enter();
	public void processInput();
	public void update(float time);
	public void render(Graphics2D graphics, Matrix3x3f matrix);
	public void exit();
	public String getName();

