public Node reverseLinkedList(Node head){
	
	// edge cases
	if(head == null || head.next == null) return head;

	Node prev = null;
	Node curr = head;
	Node next = head.next;

	while(curr != null){
		// flipping the connect edge
		curr.next = prev;

		// move the pointers
		prev = curr;
		curr = next;
		next = curr.next;
	}

	return curr;
}