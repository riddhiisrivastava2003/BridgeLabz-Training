
class TextState {
    String text;
    TextState prev, next;
}

class TextEditor {
    private TextState head, current;
    private int size = 0;
    private final int LIMIT = 10;

    void addState(String text) {
        TextState node = new TextState();
        node.text = text;



        
     
        if (current != null)
            current.next = null;

        if (head == null) {
            head = current = node;
        } else {
            current.next = node;
            node.prev = current;
            current = node;
        }

        size++;
        if (size > LIMIT)
            removeOldest();
    }



    void undo() {
        if (current != null && current.prev != null)
            current = current.prev;
    }




    


    void redo() {
        if (current != null && current.next != null)
            current = current.next;
    }



    void display() {
        if (current != null)
            System.out.println("Current Text: " + current.text);
    }




    private void removeOldest() {
        head = head.next;
        if (head != null)
            head.prev = null;
        size--;
    }
}



public class TextEditorProgram {
    public static void main(String[] args) {
        TextEditor editor = new TextEditor();

        editor.addState("State 1");
        editor.addState("State 2");
        editor.addState("State 3");




        editor.display(); 
        editor.undo();
        editor.display(); 
        editor.redo();
        editor.display(); 
    }
}
