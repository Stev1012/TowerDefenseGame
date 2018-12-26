
public interface State {
	public void enter();
	public void processInput();
	public void update();
	public void render();
	public void exit();
	public String getName();
}
