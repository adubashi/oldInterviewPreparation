import java.util.*;

package graphDFS;

public class Graph {
	private final int maxVertices = 20;
	private vertex vertexList[];
	private int adjMatrix[][];
	private int vertexCount;
	private Stack<Integer> theStack;
	
	public Graph(){
		vertexList = new vertex[maxVertices];
		adjMatrix = new int[maxVertices][maxVertices];
		vertexCount = 0;
		for(int y = 0; y < maxVertices; y++){
			for(int x = 0; x < maxVertices; x++){
				adjMatrix[x][y] = 0;
			}
		}
		theStack = new Stack<Integer>();
		
	}
	
	public void addVertex(char lab){
		vertexList[vertexCount++]  = new vertex(lab);
	}
	
	public void addEdge(int start, int end){
		adjMatrix[start][end] = 1;
		adjMatrix[end][start] = 1;
	}
	
	public void displayVertex(int v){
		System.out.println(vertexList[v].label);
	}
	
	public int getAdjUnvisitedVertex(int v){
		for(int j = 0; j < vertexCount; j++){
			if(adjMatrix[v][j] == 1 && vertexList[j].visited == false){
				return j;
			}
		}
		return -1;
	}
	
	public void dfs(){
		vertexList[0].visited = true;
		displayVertex(0);
		theStack.push(0);
		while(!theStack.isEmpty()){
			int v = getAdjUnvisitedVertex(theStack.peek());
			if(v == -1){
				theStack.pop();
			} else {
				vertexList[v].visited = true;
				displayVertex(v);
				theStack.push(v);
			}
		}
		//Reset flags
		for(int j = 0; j < vertexCount; j++){
			vertexList[j].visited = false;
		}
	}

}
