package Composition;

import java.util.ArrayList;
import java.util.List;

public class Folder {
	String name;
	List<File> files;
	List<Folder> subfolders;
	
	public Folder(String name) {
		this.name = name;
		files = new ArrayList<File>();
		subfolders = new ArrayList<Folder>();
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void addFile(File file) {
		files.add(file);
	}
	
	public void addFolder(Folder folder) {
		subfolders.add(folder);
	}
	
	public List<File> getFiles(){
		return files;
	}
	
	public List<Folder> getSubfolders(){
		return subfolders;
	}
	
	public void deleteFolder(String folderName) {
		for(int i = 0; i < subfolders.size(); i++) {
			if(subfolders.get(i).getName().equals(folderName)) {
				subfolders.remove(i);
			}
		}
	}
	
	public Folder getFolder(String name) {
		for(int i = 0; i < subfolders.size(); i++) {
			if(subfolders.get(i).getName().equals(name)) return subfolders.get(i);
		}
		return null;
	}
	
	public String toString() {
		String result = name;
		if(subfolders.size() > 0) {
			result += "\n START subfolders of " + name + ": ";
		}
		for(Folder fol: subfolders) {
			result += "\n" + fol;
		}
		if(subfolders.size() > 0) {
			result += "\n END subfolders of " + name + ": ";
		}
		if(files.size() > 0) {
			result += "\n START files of " + name + ": ";
		}
		for(File fil: files) {
			result += "\n" + fil;
		}
		if(files.size() > 0) {
			result += "\n END files of " + name + ": ";
		}
		return result;
	}
}
