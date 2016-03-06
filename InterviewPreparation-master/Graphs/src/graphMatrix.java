
public class graphMatrix {
	
	private boolean adjMatrix[][];
	private int vertexCount;
	
	public graphMatrix(int vertexCount){
		this.vertexCount = vertexCount;
		adjMatrix = new boolean[vertexCount][vertexCount];
	}
	
	public void add(int i, int j){
		if( i >= 0 && i < vertexCount && j  > 0 && j < vertexCount){
			adjMatrix[i][j] = true;
			adjMatrix[j][i] = true;
		}
	}
	
	public void remove(int i, int j){
		if( i >= 0 && i < vertexCount && j  > 0 && j < vertexCount){
			adjMatrix[i][j] = false;
			adjMatrix[j][i] = false;
		}
	}
	
	public boolean isEdge(int i, int j){
		if( i >= 0 && i < vertexCount && j  > 0 && j < vertexCount){
			return adjMatrix[i][j];
		} else {
			return false;
		}
	}
	
	

}
