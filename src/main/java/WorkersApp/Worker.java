package WorkersApp;

public class Worker {
    private final int age;
    private final int salary;
    private final String firstName;
    private final String lastName;
    private final String workerPost;
    private final Passport passport;

    public static class Builder {
        private final String firstName;
        private final String lastName;

        private int age;
        private int salary = 100;
        private String workerPost = "not set";
        private Passport passport;

        public Builder(String firstName, String lastName) {
            this.firstName = firstName;
            this.lastName = lastName;
        }

        public Builder age(int val) {
            age = val;
            return this;
        }

        public Builder workerPost(String val) {
            workerPost = val;
            return this;
        }

        public Builder salary(int val) {
            salary = val;
            return this;
        }

        public Builder passport(Passport val) {
            passport = val;
            return this;
        }

        public Worker build() {
            return new Worker(this);
        }
    }

    private Worker(Builder builder) {
        age = builder.age;
        salary = builder.salary;
        firstName = builder.firstName;
        lastName = builder.lastName;
        workerPost = builder.workerPost;
        passport = builder.passport;
    }

    @Override
    public String toString() {
        return "Name: " + firstName + " " + lastName + ", age: " + age + ", post: " + workerPost + ", salary: $" + salary + ", s/n passport: " + passport.toString();
    }
}