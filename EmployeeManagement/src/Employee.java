public class Employee {
    private int id;
    private String name;
    private String role;
    private int departmentId;
    private String email;
    private boolean rowstate;

    public Employee() {
        super();
    }

    public Employee(int id, String name, String role, int departmentId, String email, boolean rowstate) {
        this.id = id;
        this.name = name;
        this.role = role;
        this.departmentId = departmentId;
        this.email = email;
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

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public int getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(int departmentId) {
        this.departmentId = departmentId;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public boolean isRowstate() {
        return rowstate;
    }

    public void setRowstate(boolean rowstate) {
        this.rowstate = rowstate;
    }
}
