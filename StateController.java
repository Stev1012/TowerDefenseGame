import java.util.ArrayList;

public class StateController {
	//List of states to be added to when states are created
	ArrayList<State> stateList = new ArrayList<State>();
	
	//Initial state is the state that the game starts with before moving to main menu
	State currentState = new InitialState();
	
	//Calls the current state's process input method
	public void processInput(){
		currentState.processInput();
	}
	
	//Calls the current state's update method
	public void update(){
		currentState.update();
	}
	
	//Calls the current state's render method
	public void render(){
		currentState.update();
	}
	
	//Method used to add states
	public void addState(State state){
		stateList.add(state);
	}
	
	//Switches from one state to the next
	public void switchState(String state){
		currentState.exit();
		for(int i=0; i<stateList.size(); i++){
			if(state.equals(stateList.get(i).getName())){
				currentState = stateList.get(i);
			}
		}
		currentState.enter();
	}
}

