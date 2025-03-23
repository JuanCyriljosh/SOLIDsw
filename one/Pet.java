package one;
public class Pet {
    private String petName;
    private String owner;

    public Pet(String petName, String owner) {
        this.petName = petName;
        this.owner = owner;
    }

    

    public void setPetName(String petName) {
        this.petName = petName;
    }

    public String getPetName() {
        return petName;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public String getOwner() {
        return owner;
    }

    

}