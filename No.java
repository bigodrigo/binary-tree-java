public class No {
    private long id;
    private No esq, dir;

    public No(long id, No esq, No dir) {
        this.id = id;
        this.esq = esq;
        this.dir = dir;
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
}
