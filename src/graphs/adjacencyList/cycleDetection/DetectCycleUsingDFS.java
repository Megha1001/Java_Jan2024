package graphs.adjacencyList.cycleDetection;


/*
 * Approach : Do DFS traversal, if you encounter a vertex which is visited twice --> then there is a cycle. This approach has one catch. It has cycle only when the adjacent it not the parent of the vertex
 * from wher we start traversal
 *          1. Maintain a bool [] visited array.
 *          2. Do DFS traversal with adjacency matrix, visited bool array and Parent(-1-> starting)
 *          3. if Encounter any vertex who is already visited and its not its parent --> return true
 * 
 * 
 * FOR disconnected graph --> run the same algo for every disconnted component
 */

public class DetectCycleUsingDFS {
    
}
