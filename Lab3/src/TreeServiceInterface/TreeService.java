package TreeServiceInterface;

import java.util.HashSet;

import TreeService.Node;

public interface TreeService {

	public Node insert(Node root, int key);

	public boolean findpairUtil(Node root, int sum, HashSet<Integer> set);

	public void findPairWithGivenSum(Node root, int sum);
}
