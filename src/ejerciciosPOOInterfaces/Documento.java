package ejerciciosPOOInterfaces;

public abstract class Documento extends Validable{
	
	protected long size;
	
	public Documento(long size) {
		this.size = size;
	}
	
	public long getSize() {
		return size;
	}
	
	public long setSize(long size) {
		this.size = size;
		return size;
	}
	
	
	
	

}
