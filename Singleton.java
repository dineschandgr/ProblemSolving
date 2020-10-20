
public class Singleton {
	private static Singleton singleton = null;
	private Singleton(){
	}
	
	public static Singleton getInstance(){
		if(singleton == null){
			synchronized (Singleton.class) {
				if(singleton == null)
					singleton = new Singleton();
				}
		}
		return singleton;
	}
}

class singletonTest{
	public static void main(String[] args) {
		Singleton singleton = Singleton.getInstance();
		System.out.println(singleton);
		SingletonEnum singleton1 = SingletonEnum.INSTANCE;
		System.out.println(singleton1.getValue());
	}
}

enum SingletonEnum{
	INSTANCE;
	
	int value = 0;
	public int getValue(){
		return this.value;
	}
}
