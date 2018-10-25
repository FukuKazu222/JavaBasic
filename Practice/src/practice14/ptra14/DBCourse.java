package practice14.ptra14;

public class DBCourse extends JavaCourse implements practice14.common.Course {
	public String getCourseName() {
		return (practice14.common.Course.PREFIX + "DB基礎");
	}

	public String[] getCourseUnit() {

		getCourseUnit()[0] = ("DB基礎");
		getCourseUnit()[1] = ("SQL基礎");
		getCourseUnit()[2] = ("正規化");
		getCourseUnit()[3] = ("SQL応用");
		return getCourseUnit();
	}
}
