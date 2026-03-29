package abstractfactory;

public class Application {
    private final Button    button;
    private final TextField textField;
    private final Checkbox  checkbox;

    public Application(UIComponentFactory factory) {
        this.button    = factory.createButton();
        this.textField = factory.createTextField();
        this.checkbox  = factory.createCheckbox();
    }

    public void renderUI() {
        button.render();
        textField.render();
        checkbox.render();
    }
}
