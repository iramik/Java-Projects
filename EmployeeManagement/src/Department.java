public class Department {
    private int id;
    private String name;
    private boolean rowstate;

    public Department() {
        super();
    }

    public Department(int id, String name, boolean rowstate) {
        this.id = id;
        this.name = name;
        this.rowstate = rowstate;
    }

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

    public boolean isRowstate() {
        return rowstate;
    }

    public void setRowstate(boolean rowstate) {
        this.rowstate = rowstate;
    }
}
