package practice10;

public class Car {
	int serialNo;
	String color;
	int gasoline;

	public int run() {
		gasoline -=1;
		if(this.gasoline <0)  {

		return -1;
		}else{int x =new java.util.Random().nextInt(15);
		return x;
		}
	}
}
