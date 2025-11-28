package behavior.mementopattern;

public class Editor {

    private String text;
    private int posX, posY;

    public Snapshot create(){
        System.out.println("Create");
        return new Snapshot();
    }

    public void restore(Snapshot snapshot){
        System.out.println("Restore");
        this.text = snapshot.text;
        this.posX = snapshot.posX;
        this.posY = snapshot.posY;
    }

    public String getState(){
        return "text : " + text + " posX : " + posX + " posY : " + posY;
    }

    public void setText(String text) {
        this.text = text;
    }

    public void setPos(int posX, int posY) {
        this.posX = posX;
        this.posY = posY;
    }

    final class Snapshot {
        final String text;
        final int posX, posY;

        Snapshot() {
            this.text = Editor.this.text;
            this.posX = Editor.this.posX;
            this.posY = Editor.this.posY;
        }
    }
}
