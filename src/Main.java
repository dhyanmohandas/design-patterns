import memento.Editor;
import memento.History;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Started..");
		
		Editor editor = new Editor();
		History history = new History();
		  
		editor.setContent("First Content");
		history.push(editor.createState());
		
		editor.setContent("Second Content");
		history.push(editor.createState());
		
		editor.setContent("Third Content");
		editor.restore(history.pop());
		
		System.out.println(editor.getContent());
		editor.restore(history.pop());
		
		System.out.println(editor.getContent());
	}
	

}
