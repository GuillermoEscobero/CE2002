public class SalePerson implements Comparable<SalePerson> {
    private String firstName;
    private String lastName;
    private int totalSales;

    public SalePerson(String firstName, String lastName, int totalSales) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.totalSales = totalSales;
    }

    public String toString() {
        return lastName + ", " + firstName + " : " + totalSales;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if ((o == null) || (o.getClass() != this.getClass()))
            return false;
        SalePerson salePerson = (SalePerson)o;

        return (firstName == salePerson.firstName || (firstName != null && firstName.equals(salePerson.firstName))) &&
               (lastName == salePerson.lastName || (lastName != null && lastName.equals(salePerson.lastName)));
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 31 * hash + (null == firstName ? 0 : firstName.hashCode());
        hash = 31 * hash + (null == lastName ? 0 : lastName.hashCode());
        return hash;
    }

    @Override
    public int compareTo(SalePerson o) {
        int result;
        result = Integer.compare(totalSales, o.totalSales);
        if (result == 0) {
            if (lastName.compareTo(o.lastName) < 0)
                result++;
            else
                result--;
        }

        return result;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public int getTotalSales() {
        return this.totalSales;
    }
}
