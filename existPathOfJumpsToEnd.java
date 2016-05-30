/*
 Given an array of positive numbers each repersent the possible steps to the right or left of that cell
 you can travel, find wehther its possible to reach the end of the array.
*/
boolean existPathOfJumpsToEnd(int[] steps){
	int n = steps.length;
	boolean[] visited = new boolean[n];	

	return existPathOfJumpsToEndRec(steps,visited, 0);
}

boolean existPathOfJumpsToEndRec(int[] steps, boolean[] visited, int index){
	
	boolean rightPath = false, leftPath = false;
	int n = steps.length;

	// we managed to get to the end of the stepsay
	if(i==n-1) return true;
	
	// cehck we haven't been here
	if(visited[i]) return false;

	// mark that we have visited here
	visited[i] = true;

	// going right
	int right = i + steps[i];
	if(right < n) rightPath = isPath2EndRec(steps, visited, right);

	// going left
	int left = i - steps[i];
	if(left >= 0) leftPath = isPath2EndRec(steps, visited, left);

	return rightPath || leftPath;
}


public static boolean existPathOfJumpsToEndIter(int[] steps){
	
	int left, right;
	int n = steps.length, i=0;
	boolean[] visited = new boolean[n];	
	Stack<Integer> unseen = new Stack<Integer>();

	if(steps == null) return false;

	// pushing the first element
	unseen.push(0);
	while(!unseen.isEmpty()){

		// get the top of the stack index
		i = unseen.pop();

		// we got to the end
		if(i == n-1) return true;

		// mark visited cell as visited
		visited[i] = true;

		// going left if never been there
		left = i - steps[i];
		if(left >= 0 && !visited[left]) unseen.push(left);

		// going right if never been there
		right = i + steps[i];
		if(right < n && !visited[right]) unseen.push(right);
	}

	// if we got here means there is no path
	return false;

}



