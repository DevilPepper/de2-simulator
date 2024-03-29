package hardware_model.operation;

public abstract class Operator implements OperationElement {

	int precedence;
	
	public Operator(int precedence){
		this.precedence = precedence;
	}
	
	@Override
	public int getPrecedence(){
		return precedence;
	}
	
}
