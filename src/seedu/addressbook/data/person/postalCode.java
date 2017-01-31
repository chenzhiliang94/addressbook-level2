package seedu.addressbook.data.person;

public class postalCode {
		
		public String postalCode;
	
		public postalCode(String postalCode) {
			this.postalCode = postalCode.substring(1, postalCode.length());
		}
	
		public String getPostalCode() {
			return this.postalCode;
		}
		
		public void setPostalCode(String newPostalCode) {
			this.postalCode = newPostalCode;
		}
}
