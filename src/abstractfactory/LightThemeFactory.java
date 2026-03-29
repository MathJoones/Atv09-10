package abstractfactory;

public class LightThemeFactory implements UIComponentFactory {
    public Button    createButton()    { return new LightButton(); }
    public TextField createTextField() { return new LightTextField(); }
    public Checkbox  createCheckbox()  { return new LightCheckbox(); }
}
