package lambda.interfacesFunciton.supplier;

public class Arduino {
    private String proc;
    private String ftdi;

    public Arduino(String proc, String ftdi) {
        this.proc = proc;
        this.ftdi = ftdi;
    }

    public String getProc() {
        return proc;
    }

    public String getFtdi() {
        return ftdi;
    }

    public void setProc(String proc) {
        this.proc = proc;
    }

    public void setFtdi(String ftdi) {
        this.ftdi = ftdi;
    }

    @Override
    public String toString() {
        return "Arduino{" +
                "proc='" + proc + '\'' +
                ", ftdi='" + ftdi + '\'' +
                '}';
    }
}
