# QUESTIONS FORM JOB INTERVIEWS

Throughout my job hunting I came across some intersting questions, some were easier than others,<br>some were harder but I always managed to solve them all. I decided to share my solutions with<br>who ever seek for the answers to those problems, hopefully it will help someone.

I will describe the problems as they were described to me in shortly and link you to my solutions.

##Permutation of another

Given two strings you should return TRUE if one of them is permutation of another.<br>
<b>Assumptions:</b>use additional space is allowed.

Example:
<ul>
<li>the string "math" and the string "tham" are permutations of one another.</li>
<li>the string "hakuna" and the string "matata" are NOT premutations of one another.</li>
</ul>

Attached solution for this problem [here](https://github.com/omrigami/interview-questions/blob/master/isPermutationOfAnother.java "Solution").

##Network Transfer Of Binary Tree

Given a binary tree (NOT a Binary Search Tree) we want to transfer it through the network in a way<br>that the other end of the network will be able to rebuild it exactly as it was before it was tranfered over the network.<br>
<b>Assumptions:</b>use additional space is allowed.

Attached solution for this problem [here](https://github.com/omrigami/interview-questions/blob/master/NetworkTransferBinaryTree.java "Solution").

##Find Number Of Different Countries In The World

Given a matrix of size NxM (world map), return the amount of different coutries within the map while<br>
each cell has a number in the range 1-128, a group of cells that are neighbors (horizontally or vertically, NOT diagonally)<br>
with the same number inside create then same country.

Example:
<ul>
	<li>
	for the matrix {{1,1,1},{3,1,4},{5,2,4}} there should be returned the value: 5<br>
	as the four 1's at the top is 1 country, the two 4's on the bottom right is another<br>
	and the 3, 5 and 2 are three more small countries.
	</li><br><li>
	for the matrix {{1,1,1},{1,2,1},{1,1,1}} there should be returned the value: 2<br>
	as there is a country inside of a country (2 sourndede by 1's).
	</li>
</ul>

<b>Assumptions:</b>use additional space is allowed.

Attached solution for this problem [here](https://github.com/omrigami/interview-questions/blob/master/FindNumberOfCountries.java "Solution").