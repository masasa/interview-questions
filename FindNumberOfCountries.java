public class FindNumberOfCountries {

    private class Node{

        int c;  // country number
        boolean v; // visited
        Node u,d,l,r; // neighbors in 'graph'

        public Node(int country){
            v = false;
            c = country;
        }
    }

    private void visitNeighbors(Node n){
        // doesn't exist or visited already
        if(n == null || n.v) return;

        // marking visited
        n.v = true;

        // visiting all possible neighbors
        visitNeighbors(n.u); // up
        visitNeighbors(n.r); // right
        visitNeighbors(n.d); // down
        visitNeighbors(n.l); // left
    }

    public int solution(int[][] m){

        if(m == null) return 0;

        int h = m.length;
        int w = m[0].length;
        int countriesCounter = 0;

        // matrix of nodes
        Node[][] nodes = new Node[h][w];

        // creating nodes for all pieces of the matrix
        for(int i = 0; i < h; i++) {
            for (int j = 0; j < w; j++) {

                // creating a node for each cell
                Node n = new Node(m[i][j]);

                // left of me - linking us both
                if (j - 1 >= 0 && m[i][j - 1] == m[i][j]) {
                    n.l = nodes[i][j - 1];
                    nodes[i][j - 1].r = n;
                }

                // above me - linking us both
                if (i - 1 >= 0 && m[i - 1][j] == m[i][j]) {
                    n.u = nodes[i - 1][j];
                    nodes[i - 1][j].d = n;
                }

                // saving the new link in the data structure
                nodes[i][j] = n;
            }
        }

        // counting the different coutries that are not attached together
        for(int i = 0; i < h; i++)
            for(int j = 0; j < w; j++)
                // checking if visited already
                if(!nodes[i][j].v) {
                    //counting a country;
                    countriesCounter++;

                    // going to all the neighbors;
                    visitNeighbors(nodes[i][j]);
                }
        
        return countriesCounter;
    }

    public static void main(String[] args){

        FindNumberOfCountries countriesFinder = new FindNumberOfCountries();

        // in this example there should be 11 different countries
        int[][] m = {
                {1,2,2},
                {3,4,2},
                {5,6,2},
                {6,6,6},
                {7,7,9},
                {8,9,9},
                {6,1,1}};
        
        System.out.println("The number of different countries is: " + countriesFinder.solution(m));
    }

}