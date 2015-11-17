package operation;

public abstract class CoreOperation {
	protected float resut;
	
	public abstract float operationAdd(float value);
	public abstract float operationSub(float value);
	public abstract void multi(float value);
	public abstract void div(float value);
	
	public void restetValue(){
		resut = 0;
	}
	
	
	

}
