package transport;

import com.sun.jdi.connect.Transport;

public class Mehanic<T extends Transport> {

    private final String name;
    private final String surname;
    private final String company;

    public Mehanic(String name, String surname, String company) {
        this.name = name;
        this.surname = surname;
        this.company = company;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getCompany() {
        return company;
    }


    private boolean service() {
        return service();
    }

    private void repair() {
    }

    @Override
    public String toString() {
        return name + " " + surname + " из " + company;
    }
}
