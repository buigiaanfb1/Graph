package simpleGraphs.vertex;

public class TraversedVertex implements Comparable<TraversedVertex>{
	public Vertex v;
	public int num;
	
	
	public TraversedVertex(Vertex v, int num) {
		super();
		this.v = v;
		this.num = num;
	}

	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "(" + v.key + ", " + v.num + ")";
	}


	@Override
	public int compareTo(TraversedVertex t) {
		// TODO Auto-generated method stub
		return num < t.num ? -1 : num > t.num ? 1 : 0;
	}
	
}
