import java.util.ArrayList;
import java.util.Collections;

//コレクションのシャッフルの方法
public class bully {
	public static void main(String[] args)throws Exception {
		ArrayList<String> array = new ArrayList<String>();
		array.add("test1");
		array.add("test2");
		array.add("test3");
		Collections.shuffle(array);
		String result = array.get(0);
		System.out.println("シャッフルされたリストの先頭 : " + result);
	}
}
