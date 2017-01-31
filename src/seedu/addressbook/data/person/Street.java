package seedu.addressbook.data.person;

public class Street {
		
		public String streetName;
	
		public Street(String streetName) {
			this.streetName = streetName.substring(1, streetName.length()-1);
		}
	
		public String getStreetName() {
			return this.streetName;
		}
		
		public void setStreetName(String newStreetName) {
			this.streetName = newStreetName;
		}
}
