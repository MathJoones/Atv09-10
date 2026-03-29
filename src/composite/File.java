package composite;

public class File implements FileSystemComponent {
    private final String name;
    private final long size;

    public File(String name, long size) {
        this.name = name;
        this.size = size;
    }

    public String getName() {
        return name;
    }

    public long getSize() {
        return size;
    }

    public void display(String indentation) {
        System.out.printf("%s%s (%.1f MB)%n", indentation, name, size / 1_000_000.0);
    }

    public void add(FileSystemComponent component) {
        throw new UnsupportedOperationException("Arquivo não pode conter componentes.");
    }

    public void remove(FileSystemComponent component) {
        throw new UnsupportedOperationException("Arquivo não pode conter componentes.");
    }
}
