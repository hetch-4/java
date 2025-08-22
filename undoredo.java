import java.util.*;

class TextEditor {
    Stack<String> undoStack = new Stack<>();
    Stack<String> redoStack = new Stack<>();
    String text = "";

    void write(String word) {
        undoStack.push(text);
        text += word;
        redoStack.clear(); // reset redo history
    }

    void undo() {
        if (!undoStack.isEmpty()) {
            redoStack.push(text);
            text = undoStack.pop();
        }
    }

    void redo() {
        if (!redoStack.isEmpty()) {
            undoStack.push(text);
            text = redoStack.pop();
        }
    }

    void showText() {
        System.out.println("Text: " + text);
    }
}

public class Main {
    public static void main(String[] args) {
        TextEditor editor = new TextEditor();
        editor.write("Hello ");
        editor.write("World!");
        editor.showText(); // Hello World!

        editor.undo();
        editor.showText(); // Hello 

        editor.redo();
        editor.showText(); // Hello World!
    }
}