class FullUserInfo extends UserInfo {
    private String lastname;

    FullUserInfo(String name, String lastname) {
        super(name);
        this.lastname = lastname;
    }
    @Override
    String getInitials() {
        return "" + super.toString().charAt(0) + "." + lastname.charAt(0);
    }
    @Override
    public String toString() {
        return super.toString() + " " + lastname;
    }
}
