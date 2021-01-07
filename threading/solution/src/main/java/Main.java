public class Main {

    public static void main(String[] args)
    {
        System.out.println("Find an n-coloring of a graph.\n");

        //initialize the graph

        Graph graph=new Graph(5);

        graph.addEdge(0,1);
        graph.addEdge(0,2);
        graph.addEdge(1,2);
        graph.addEdge(1,3);
        graph.addEdge(2,3);
        graph.addEdge(3,4);

        long startTime=System.nanoTime();

        graph.colorGraph();

        long endTime=System.nanoTime();

        long time=endTime-startTime;

        graph.printColors();

        System.out.println("Duration: "+time/1000000 + " milliseconds.");

    }

}
