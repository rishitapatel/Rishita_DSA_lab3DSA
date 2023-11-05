package TreeMain;


import TreeService.Node;
import TreeService.TreeServiceImpl;

public class TreeDriver {
public static void main(String[] args) {
	Node root = null;
	
	TreeServiceImpl treeService = new TreeServiceImpl();
	root = treeService.insert(root, 40);
	root = treeService.insert(root, 20);
	root = treeService.insert(root, 60);
	root = treeService.insert(root, 10);
	root = treeService.insert(root, 30);
	root = treeService.insert(root, 50);
	root = treeService.insert(root, 70);

	int sum = 130;
	treeService.findPairWithGivenSum(root, sum);
	
	
	
	
	
	
	
	
	
}
}
