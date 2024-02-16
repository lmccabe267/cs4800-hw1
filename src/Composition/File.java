package Composition;

public class File {
	private String filename;
	
	public File(String filename) {
		this.filename = filename;
	}
	
	public String getFileName() {
		return filename;
	}
	
	public void setFileName(String filename) {
		this.filename = filename;
	}
	
	public String toString() {
		return filename;
	}
}
