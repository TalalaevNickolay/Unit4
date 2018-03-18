package by.htp.unit4;

public class MainNotes {

	public static void main(String[] args) {
		
		NoteBook notebook = new NoteBook("YaYa");
		notebook.add("testing",1,1,2005);
		notebook.add("trying",2,3,2007);
		notebook.add("killing",17,8,2011);
		
		notebook.findNote(17,8,2011);
		notebook.remove("trying",2,3,2007);
		notebook.print();

	}

}
