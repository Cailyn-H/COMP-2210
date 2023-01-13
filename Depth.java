package COMP2210;

public class Depth {
	//this function will return -1 if not found or the level of the node
    public int depthWithLevel(Node root,T value, int level){
            // if there is nothing in the tree then return -1
            if(root == null)
                    return -1;
            // if element is same as value then return the level
            if(root.element == value)
                    return level;            
            // finding the node in left subtree and checking the level
            int recLevel = depthWithLevel(root.left, value, level+1);
            // if the level is found or not equal to -1 then return level
            if(recLevel != -1)
                    return recLevel;            
            // finding the node in right subtree and returing the level
            recLevel = depthWithLevel(root.right, value, level+1);
            return recLevel;
    }  
//* Returns the depth of the node containing value
//* or -1 if value not present.
public int depth(T value) {
            return depthWithLevel(root,value, 1);
}
public static void main(String[] args) {
    BinarySearchTree<Integer> iBst = new BinarySearchTree<>();
    iBst.add(10);
    iBst.add(12);
    iBst.add(8);
    iBst.add(2);
    iBst.add(6);
    iBst.add(4);
    boolean found = iBst.contains(7);}
public boolean contains(T value) {
    boolean found = false;
    while ((root != null)&&(!found)) {
        if (((root.element).compareTo(value))== 0) {
            found = true;
        }
        else if (((root.element).compareTo(value))== 1) {
            root = root.left;
        }
        else {
            root = root.right;
        }
    }
    return found;
}
public T max() { 
    Node current = root;
    T max;
    if (root == null) {
        return null;
    }
    else {
        max = root.element;
        while(current != null) {
        	//max is smaller than current.element = -1
            if ((max.compareTo(current.element))==-1){
                max = current.element;
            }
            current = current.right;
        }
    }
    return max;
}  
}
