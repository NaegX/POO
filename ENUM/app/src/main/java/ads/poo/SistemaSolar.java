package ads.poo;

public enum SistemaSolar {
    MERCURIO(1),
    VENUS(2),
    TERRA(3),
    MARTE(4),
    JUPITER(5),
    SATURNO(6),
    URANO(7),
    NETUNO(8);

    private int position;

    private SistemaSolar(int position) {
        this.position = position;
    }

    public int getPosition() {
        return position;
    }

    public String toString() {
        return "A";
    }

}
