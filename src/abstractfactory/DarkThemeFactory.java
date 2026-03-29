package abstractfactory;

public class DarkThemeFactory implements UIComponentFactory {
    public Button    createButton()    { return new DarkButton(); }
    public TextField createTextField() { return new DarkTextField(); }
    public Checkbox  createCheckbox()  { return new DarkCheckbox(); }
}
