package list_arraylist_implementation;

public class ArrayList {
	private int size = 0; // 몇개의 데이터가 이 list 에 들어가 있는가
	private Object[] elementData = new Object[100];
	
	public boolean addLast(Object element) {
		elementData[size] = element;
		size++;
		return true;
	}
}
