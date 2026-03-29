package composite;

import java.util.ArrayList;
import java.util.List;

public class Directory implements FileSystemComponent {
    private final String name;
    private final List<FileSystemComponent> components = new ArrayList<>();

    public Directory(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public long getSize() {
        long total = 0;
        for (FileSystemComponent component : components) {
            total += component.getSize();
        }
        return total;
    }

    public void add(FileSystemComponent component) {
        components.add(component);
    }

    public void remove(FileSystemComponent component) {
        components.remove(component);
    }

    public void display(String indentation) {
        System.out.println(indentation + name + "/");
        for (int i = 0; i < components.size(); i++) {
            boolean isLast = (i == components.size() - 1);
            String prefix  = indentation + (isLast ? "└─ " : "├─ ");
            String childIn = indentation + (isLast ? "   " : "│  ");
            FileSystemComponent component = components.get(i);
            if (component instanceof Directory) {
                System.out.print(prefix.substring(0, prefix.length() - 3));
                component.display(prefix.substring(0, prefix.length() - 3));
            } else {
                component.display(prefix);
            }
        }
    }
}
