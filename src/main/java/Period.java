import java.util.Date;

public class Period {

    private final Date start;
    private final Date end;

    public Period(Date start, Date end) {
        if(start.compareTo(end) > 0)
            throw new IllegalArgumentException(start + "after" + end);
        this.start = new Date(start.getTime());
        this.end = new Date(end.getTime());
    }

    public Date getStart() {
        return new Date(start.getTime());
    }

    public Date getEnd() {
        return new Date(end.getTime());
    }

    public static void main(String[] args) {
        Date start = new Date();
        Date end = new Date();
        Period p = new Period(start , end);
        end.setYear(78);
        System.out.println(p.getStart());
        System.out.println(p.getEnd());
    }
}
