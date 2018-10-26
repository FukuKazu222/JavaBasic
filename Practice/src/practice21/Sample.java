package practice21;

public class Sample {
	public static void main(String[] args) {
		try {
			System.out.println(numCheck(10));
			System.out.println(numCheck(-2));
		}catch(RuntimeException e) {
			System.out.println("RuntimeExceptionが発生しました");
		}
	}
	public static int numCheck(int num) {
		if(num<0) {
			throw new RuntimeException();
		}
		return num;
	}
}