public class No {
    private long id;
    private No esq, dir;
    private long nivel;

    public No(long id, No esq, No dir, long nivel) {
        this.id = id;
        this.esq = esq;
        this.dir = dir;
        this.nivel = nivel;
    }

    public long getId() {
        return this.id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public No getEsq() {
        return esq;
    }

    public void setEsq(No esq) {
        this.esq = esq;
    }

    public No getDir() {
        return dir;
    }

    public void setDir(No dir) {
        this.dir = dir;
    }

    public long getNivel() {
        return this.nivel;
    }

    public void setNivel(long nivel) {
        this.nivel = nivel;
    }
}
