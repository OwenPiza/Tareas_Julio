public class Modelo {
    // Clases de los teoremas físicos disponibles
    private M_U m_u;
    private M_UA m_ua;
    private CaidaLibre caidaLibre;
    private Movimiento2D movimiento2d;

    // Constructor sin parámetros
    public Modelo() {
        m_u = new M_U();
        m_ua = new M_UA();
        caidaLibre = new CaidaLibre();
        movimiento2d = new Movimiento2D();
    }

    // Métodos getter y setter
    public M_U getM_u() {
        return m_u;
    }

    public void setM_u(M_U m_u) {
        this.m_u = m_u;
    }

    public M_UA getM_ua() {
        return m_ua;
    }

    public void setM_ua(M_UA m_ua) {
        this.m_ua = m_ua;
    }

    public CaidaLibre getCaidaLibre() {
        return caidaLibre;
    }

    public void setCaidaLibre(CaidaLibre caidaLibre) {
        this.caidaLibre = caidaLibre;
    }

    public Movimiento2D getMovimiento2d() {
        return movimiento2d;
    }

    public void setMovimiento2d(Movimiento2D movimiento2d) {
        this.movimiento2d = movimiento2d;
    }
}
