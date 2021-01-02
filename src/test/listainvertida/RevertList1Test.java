package listainvertida;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

class RevertList1Test {

	@Test
	void test() {
		List<String> list = new ArrayList<String>();
		list.add("Student1");
		list.add("Student2");
		list.add("Student3");
		list.add("Student4");
		list.add("Student5");
		list.add("Student6");
		list.add("Student7");
		list.add("Student8");
		list.add("Student9");
		list.add("Student10");
		list.add("Student11");
		list.add("Student12");
		list.add("Student13");
		list.add("Student14");
		list.add("Student15");
		
		List<String> listreverted = RevertList1.revert(list);
		assertTrue("Student15" == listreverted.get(0));
		assertTrue("Student1" == listreverted.get(14));
	}

}
