public Node reverseLinkedList(Node head){
	
	// edge cases
	if(head == null || head.next == null) return head;

	Node prev = null;
	Node curr = head;
	Node next = null;

	while(curr != null){
		
		// saving next node
		next = curr.next;

		// flipping the connect edge
		curr.next = prev;

		// move the pointers
		prev = curr;
		curr = next;
	}

	return prev;
}