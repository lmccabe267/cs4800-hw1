package Composition;

public class Driver {
	public static void main(String[] args) {
		Folder demo1 = new Folder("demo1");
		demo1.addFolder(new Folder("Source Files"));
		Folder tmp = demo1.getFolder("Source Files");
		tmp.addFolder(new Folder(".phalcon"));
		tmp.addFolder(new Folder("app"));
		tmp = tmp.getFolder("app");
		tmp.addFolder(new Folder("config"));
		tmp.addFolder(new Folder("controllers"));
		tmp.addFolder(new Folder("library"));
		tmp.addFolder(new Folder("migrations"));
		tmp.addFolder(new Folder("models"));
		tmp.addFolder(new Folder("views"));
		tmp = demo1.getFolder("Source Files");
		tmp.addFolder(new Folder("cache"));
		tmp.addFolder(new Folder("public"));
		tmp = tmp.getFolder("public");
		tmp.addFile(new File(".htaccess"));
		tmp.addFile(new File(".htrouter.php"));
		tmp.addFile(new File("index.html"));
		tmp = demo1.getFolder("Source Files");
		tmp.addFolder(new Folder("Include Path"));
		tmp.addFolder(new Folder("Remote Files"));
		
		System.out.println(demo1);
		System.out.println("\nDELETING APP\n");
		
		tmp.deleteFolder("app");
		
		System.out.println(demo1);
		System.out.println("\nDELETING PUBLIC\n");
		
		tmp.deleteFolder("public");
		System.out.println(demo1);
	}
}
