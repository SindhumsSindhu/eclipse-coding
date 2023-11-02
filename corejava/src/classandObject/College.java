package classandObject;

 class College1{

	//public static void main(String[] args) {
		private String name;
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public void displayPerson() {
			System.out.println("Data of the Person class: ");
			System.out.println("Name: " + this.name);
		}
}

	public class College extends College1 {
		

		public static void main(String[] args) {
			College1 std = new College1();
			std.setName("Pooja");
			System.out.println(std.getName());
			std.displayPerson();
			std.displayPerson();
		

	}
		
}
	


