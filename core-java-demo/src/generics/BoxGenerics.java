package generics;

public class BoxGenerics<T,K> {
	private T length;
	private T breadth;
	private K height;
	
	public BoxGenerics(T length, T breadth, K height) {
		super();
		this.length = length;
		this.breadth = breadth;
		this.height = height;
	}

	public T getLength() {
		return length;
	}

	public void setLength(T length) {
		this.length = length;
	}

	public T getBreadth() {
		return breadth;
	}

	public void setBreadth(T breadth) {
		this.breadth = breadth;
	}

	public K getHeight() {
		return height;
	}

	public void setHeight(K height) {
		this.height = height;
	}

	@Override
	public String toString() {
		return "BoxGenerics [length=" + length + ", breadth=" + breadth + ", height=" + height + "]";
	}
}
