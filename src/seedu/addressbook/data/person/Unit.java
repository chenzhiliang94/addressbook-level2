package seedu.addressbook.data.person;

public class Unit {
		
		public String unitName;
	
		public Unit(String unitName) {
			unitName = unitName.substring(1, unitName.length()-1);
		}
	
		public String getUnitName() {
			return this.unitName;
		}
		
		public void setUnitName(String newUnitName) {
			unitName = newUnitName;
		}
}
