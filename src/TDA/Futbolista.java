package TDA;

public class Futbolista {
	
	private String nombreJug;
	private String colorPlayera;
	private byte numeroJug;
	private String posicionJug;
	private String nacionJug;
	
	
	public Futbolista() {}
	
	public Futbolista(String nombreJug, String colorPlayera, byte numeroJug, String posicionJug,String nacionJug) {
		this.nombreJug=nombreJug;
		this.colorPlayera=colorPlayera;
		this.numeroJug=numeroJug;
		this.posicionJug=posicionJug;
		this.nacionJug=nacionJug;
 
		
	}
	
	public void setnombreJug(String nombreJug) {
		this.nombreJug = nombreJug;
	}
	
	public void setcolorPlayera(String colorPlayera) {
		this.colorPlayera=colorPlayera;
	}
	
	public void setnumeroJug(byte numeroJug) {
		this.numeroJug=numeroJug;
	}
	
	public void setposicionJug(String posicionJug) {
		this.posicionJug=posicionJug;
	}
	
	public void setnacionJug(String nacionJug) {
		this.nacionJug=nacionJug;
	}

	@Override
	public String toString() {
		return "Futbolista [nombreJug=" + nombreJug + ", colorPlayera=" + colorPlayera + ", numeroJug=" + numeroJug
				+ ", posicionJug=" + posicionJug + ", nacionJug=" + nacionJug + "]";
	}
}	
    
	