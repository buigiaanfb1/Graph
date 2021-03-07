package simpleGraphs.vertex;

public class AdjInfo implements Comparable<AdjInfo>{
	public Vertex dest;
	public double weight = 1;
	
	public AdjInfo(Vertex dest) {
		super();
		this.dest = dest;
	}

	public AdjInfo(Vertex dest, double weight) {
		super();
		this.dest = dest;
		this.weight = weight;
	}
	


	@Override
	public int compareTo(AdjInfo t) {
		// TODO Auto-generated method stub
		return dest.compareTo(t.dest);
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "(" + dest.key + ", " + weight + ")";
	}

	public double getWeight() {
		return weight;
	}

}
