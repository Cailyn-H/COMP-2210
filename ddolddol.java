package COMP2210;

public class ddolddol {

	public static <T> void main(String[] args) {
		// TODO Auto-generated method stub
		T[] elements = (T[]) new Object[5];
		int index = 0;
		for (int i = elements.length-1; i > index; i--) {
            
            elements[i] = elements[i-1];
            System.out.println(i);
            
    }
    
	}

}
