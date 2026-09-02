public class LambdaDemo {
    public static void main(String[] args) {
        Employee alice = EmployeeData.sample().get(0);

        // TODO: anonymous class implementing SalaryCheck — salary > 60_000
        SalaryCheck anonymous = new SalaryCheck() {
            @Override
            public boolean test(Employee employee) {
                return _____;
            }
        };

        // TODO: lambda with the same SalaryCheck contract and same result
        SalaryCheck lambda = _____;

        System.out.println("Employee: " + alice.name());
        System.out.println("Anonymous result: " + anonymous.test(alice));
        System.out.println("Lambda result: " + lambda.test(alice));
    }
}
