package listainvertida;

import java.util.List;

public class RevertList1 {
	
	public static List<String> revert(List<String> list) {
		String aux;
		for (int i = 0; i < list.size()/2; i++) {
			aux = list.get(i);
			list.set(i, list.get(list.size()-1-i));
			list.set(list.size()-1-i, aux);
		}
		return list;
	}

}
