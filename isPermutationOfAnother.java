class IsPermutationOfAnother{

	public boolean solution(String s1, String s2){

        // checking both exist and of the same length
        if(s1 == null || s2 == null || s1.length() != s2.length())
            return false;

        // transferring both string to array of chars for sorting
        char[] s1A = s1.toCharArray();
        char[] s2A = s2.toCharArray();

        // sorting both strings
        java.util.Arrays.sort(s1A);
        java.util.Arrays.sort(s2A);

        // creating strings from the new sorted arrays
        String s1Sorted = new String(s1A);
        String s2Sorted = new String(s2A);

        return s1Sorted.equals(s2Sorted);
    }
	
}