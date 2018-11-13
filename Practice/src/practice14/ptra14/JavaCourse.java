package practice14.ptra14;

public class JavaCourse implements practice14.common.Course{
	public String getCourseName(){
		return practice14.common.Course.PREFIX+"java";
	}
	public String[] getCourseUnit() {
		getCourseUnit()[0] =("式と演算");
		getCourseUnit()[1] =("制御構文");
		getCourseUnit()[2] =("メソッド");
		getCourseUnit()[3] =("配列");
		getCourseUnit()[4] =("オブジェクト指向");
		getCourseUnit()[5] =("継承");
		getCourseUnit()[6] =("高度な継承");
		return getCourseUnit();
	}//簡略化return new String[,,,,]
}
