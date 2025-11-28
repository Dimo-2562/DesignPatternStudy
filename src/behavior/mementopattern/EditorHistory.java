package behavior.mementopattern;

import java.util.ArrayDeque;
import java.util.Deque;

public class EditorHistory {

    protected Deque<Editor.Snapshot> stack;

    public EditorHistory() {
        this.stack = new ArrayDeque<>();
    }

    public void makeBackup(Editor origin) {
        Editor.Snapshot memento = origin.create();
        stack.push(memento);
    }

    public Editor undo(Editor origin) {
        Editor.Snapshot memento = stack.pop();
        origin.restore(memento);
        return origin;
    }
}
