package operation;

import java.awt.TextField;

public class DecimalCalculation extends CoreOperation{

	@Override
	public float operationAdd(float value) {
		// TODO Auto-generated method stub
		resut+= value;
		return resut;
	}

	@Override
	public float operationSub(float value) {
		// TODO Auto-generated method stub
		resut-=value;
		return resut;
	}

	@Override
	public void multi(float value) {
		resut*=value;	
			}

	@Override
	public void div(float value) {
		// TODO Auto-generated method stub
		resut/=value;
			}
	public float multi1(float value){
		multi(value);
		return resut;
	}
	public float div1(float value){
		div(value);
		return resut;
	}
}
