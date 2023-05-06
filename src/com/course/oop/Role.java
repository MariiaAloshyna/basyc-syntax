package com.course.oop;

public class Role {
    private final boolean viewAll;
    private final boolean editAll;
    private final boolean addAll;
    private final boolean deleteAll;

    public Role(RoleType roleType) {
        switch (roleType) {
            case ADMIN:
                this.viewAll = true;
                this.editAll = true;
                this.addAll = true;
                this.deleteAll = true;
                break;
            case CUSTOMER:
                this.viewAll = true;
                this.editAll = false;
                this.addAll = true;
                this.deleteAll = false;
                break;
            case MAIN_CUSTOMER:
                this.viewAll = true;
                this.editAll = true;
                this.addAll = true;
                this.deleteAll = false;
                break;
            case VIEWER:
                this.viewAll = true;
                this.editAll = false;
                this.addAll = false;
                this.deleteAll = false;
                break;
            default:
                this.viewAll = false;
                this.editAll = true;
                this.addAll = true;
                this.deleteAll = true;
                break;
        }
    }

    @Override
    public String toString() {
        return "Role{" +
                "viewAll=" + viewAll +
                ", editAll=" + editAll +
                ", addAll=" + addAll +
                ", deleteAll=" + deleteAll +
                '}';
    }
}