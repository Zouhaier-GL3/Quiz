package customlistviewadapterexam;

/**
 * Created by NgocTri on 11/15/2015.
 */
public class Note {
    private int id;
    private String name;
    private String prenom;
    private String description;

    //Constructor

    public Note(int id, String name, int prenom, String description) {
        this.id = id;
        this.name = name;
        this.prenom = prenom;
        this.description = description;
    }

    //Setter, getter

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
