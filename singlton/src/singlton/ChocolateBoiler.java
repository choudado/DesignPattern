package singlton;

public class ChocolateBoiler {
	private boolean empty;
	private boolean boilded;
	
	public ChocolateBoiler(){
		empty =true;
		boilded = false;
	} 

	public void fill(){
		if(isEmpty()){
			empty =false;
			boilded = false;
			//在鍋爐內填滿巧克力和牛奶的混合物
		}
	}

	public void drain(){
		if(!isEmpty() && isboilded()){
			//排出煮沸的巧克力和牛奶
			empty =true;
		}
	}

	public void boil(){
		if(isEmpty()){
			//內容物煮沸
			boilded = true;
		}
	}
	
	

	
	private boolean isEmpty() {
		return empty;
	}
	
	private boolean isboilded() {
		return boilded;							//123test
	}
		
}
