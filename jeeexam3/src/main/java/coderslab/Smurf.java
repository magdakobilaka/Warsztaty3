package coderslab;

public class Smurf {
    private String name;
    private String atribiute;
    private String description;

    public Smurf() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAtribiute() {
        return atribiute;
    }

    public void setAtribiute(String atribiute) {
        this.atribiute = atribiute;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Smurf(String name, String atribiute, String description) {
        this.name = name;
        this.atribiute = atribiute;
        this.description = description;


    }
}
