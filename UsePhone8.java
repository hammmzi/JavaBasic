import java.util.ArrayList;
import java.util.List;

public class UsePhone8 {


	public static void main(String[] args) {
		
		List<Phone3> list = new ArrayList<Phone3>();
		
		list.add(new Phone3("0545-0000-1111"));
		list.add(new HandyPhone4("0080-4444-3333", "aaa@ccc.jp"));
		list.add(new Phone3("03-3333-3333"));
		
		for (Phone3 p : list) {
			p.tel("0120-4444-4444");
		}
	}
}
