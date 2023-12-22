abstract class Company {

	public abstract void companyType();

	public abstract void companyType1();

	public int companyId;

	public Company(int companyId) {
		this.companyId = companyId;
		System.out.println("Company Constructor");
	}

	public void registrationProcess() {// Concrete methods...
		System.out.println("Company registration processed...");
	}
}

class PrivateCompany extends Company {

	public PrivateCompany(int companyId) {
		super(companyId);
		System.out.println("PrivateCompany Constructor");
	}

	@Override
	public void companyType() {
		System.out.println("Private Company....");
	}

	@Override
	public void companyType1() {

	}
}

public class AbstractionDemo {

	public static void main(String[] args) {
		Company company = new PrivateCompany(100);
		company.companyType();
		company.registrationProcess();

		Company company1 = new Company(200) {// Anonymous Class.

			@Override
			public void companyType() {
				System.out.println("Public Company....");
			}

			@Override
			public void companyType1() {
				System.out.println("Public Company1....");
			}
		};

		company1.companyType();
		company1.companyType1();

		new Company(200) {// Anonymous Class. AbstractionDemo$1

			@Override
			public void companyType() {
				System.out.println("Public Company....");
			}

			@Override
			public void companyType1() {
				System.out.println("Public Company1....");
			}

		}.companyType();

		// company1.companyType();
		// company1.companyType1();
		// company1.registrationProcess();

	}
}
