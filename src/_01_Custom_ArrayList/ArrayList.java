package _01_Custom_ArrayList;

@SuppressWarnings("unchecked")

public class ArrayList <T> {
	
	Object[] array;
	
	public ArrayList() {
		array = new Object[] {};
	}
	
	public T get(int loc) throws IndexOutOfBoundsException {
		return (T) array[loc];
	}
	
	public void add(T val) {
		Object[] newArr = new Object[array.length+1];
		
		for (int i = 0; i < newArr.length-1; i++) {
			newArr[i] = array[i];
		}
		
		newArr[array.length] = val;
		
		array = newArr;
	}
	
	public void insert(int loc, T val) throws IndexOutOfBoundsException {
		Object[] newArr = new Object[array.length+1];
		
		for (int i = 0; i < loc; i++) {
			newArr[i] = array[i];
		}
		
		newArr[loc] = val;
		
		for (int i = loc+1; i < array.length+1; i++) {
			newArr[i] = array[i-1];
		}
		
		array = newArr;
	}
	
	public void set(int loc, T val) throws IndexOutOfBoundsException {
		array[loc] = val;
	}
	
	public void remove(int loc) throws IndexOutOfBoundsException {
		Object[] newArr = new Object[array.length-1];
		
		for (int i = 0; i < loc; i++) {
			newArr[i] = array[i];
		}
		
		for (int i = loc+1; i < array.length; i++) {
			newArr[i-1] = array[i];
		}
		
		array = newArr;
	}
	
	public boolean contains(T val) {
		for (Object item : array) {
			if (item.equals(val)) {
				return true;
			}
		}
		
		return false;
	}
	
	public int size() {
		return array.length;
	}
}