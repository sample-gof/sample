package strategy;

/**
 */
public class TestStrategy {

	public static void main(String[] args) {
		StaffContext strategy = new StaffContext(1);
		Staff staff = strategy.getStaff("123,佐藤 テスト,234,-,090,789");
		System.out.println(staff.getId());
		System.out.println(staff.getLastName());
		System.out.println(staff.getFirstName());
		System.out.println(staff.getAddress());
		System.out.println(staff.getPostCode());
		System.out.println(staff.getTel());

		strategy = new StaffContext(2);
		Staff staffB = strategy.getStaff("798,佐藤 テスト,654,-,080,798,,1,1,1,5,3");
		System.out.println(staffB.getId());
		System.out.println(staffB.getLastName());
		System.out.println(staffB.getFirstName());
		System.out.println(staffB.getAddress());
		System.out.println(staffB.getPostCode());
		System.out.println(staffB.getTel());
	}
}