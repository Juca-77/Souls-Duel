package SoulsDuel.model.menu;

import java.util.Arrays;
import java.util.List;

public class DeadMenu  {
    private List<String> entries;
    private int currentEntry = 0;

    public DeadMenu() {this.entries= Arrays.asList("Restart", "Back");}

    public void nextEntry() {
        currentEntry++;
        if (currentEntry > this.entries.size() - 1)
            currentEntry = 0;
    }

    public void previousEntry() {
        currentEntry--;
        if (currentEntry < 0)
            currentEntry = this.entries.size() - 1;
    }

    public String getEntry(int i) {
        return entries.get(i);
    }

    public boolean isSelected(int i) {
        return currentEntry == i;
    }

    public boolean isSelectedBack() {
        return isSelected(1);
    }

    public boolean isSelectedRestart() {
        return isSelected(0);
    }

    public int getNumberEntries() {
        return this.entries.size();
    }

    public int getCurrentEntry() {
        return currentEntry;
    }
    public void setEntries(List<String> entries) {
        this.entries=entries;
    }
}
