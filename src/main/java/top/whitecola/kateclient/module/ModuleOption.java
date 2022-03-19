package top.whitecola.kateclient.module;


public class ModuleOption {
    public String optionName;
    public boolean enabled;
    public float level;

    public ModuleOption setEnabled(boolean enabled) {
        this.enabled = enabled;
        return this;
    }

    public ModuleOption setOptionName(String optionName) {
        this.optionName = optionName;
        return this;
    }

    public ModuleOption setLevel(float level) {
        this.level = level;
        return this;
    }
}
