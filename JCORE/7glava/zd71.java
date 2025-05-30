import java.util.*;

public class zd71 {
    public static void main(String[] args) {
        
    }

    public static class Note {

        public final List<String> notes = new ArrayList<>();
  
            
        public synchronized void addNote(int index, String note) {
           
            System.out.println("Сейчас будет добавлена заметка [" + note + "] На позицию " + index);
                notes.add(index, note);
            System.out.println("Уже добавлена заметка [" + note + "]");
        }

        public void removeNote(int index) {
            System.out.println("Сейчас будет удалена заметка с позиции " + index);
            String line = null;
                line = notes.remove(index);
            System.out.println("Уже удалена заметка [" + line + "] с позиции " + index);
        }
    }
}

