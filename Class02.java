package myJava15;

class CTest extends Thread {
	private String id;

	public CTest(String str) {
		id = str;
	}

//(a)
	public void run() {
		for (int i = 1; i <= 5; i++) {
			for (int j = 0; j < 1000000000; j++)
				;
			System.out.println(id + " " + i);
		}
	}
}

//(b)
public class Class02 {

	public static void main(String[] args) {
		CTest hi = new CTest("Hello");
		CTest bye = new CTest("Good bye");
		hi.run();
		bye.run();
	}
}
//(c)
//(d)�{������ɡA�|���N"Hello 1"~"Hello 5"�C�L��������A�b�L�X"Good bye 1"~"Good bye 5"�C�n�ϥΦh������ɡA�����n�� start() method �ӱҰʡA�� start() method �b�Ƶ{�����n��������A��o�Ӱ�����}�l����Arun() method �۵M�N�|�Q�I�s�C