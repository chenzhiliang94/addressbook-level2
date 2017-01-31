package seedu.addressbook.data.person;

public class Block {
	
		public String blockNumber;
	
		public Block(String blockNumber) {
			this.blockNumber = blockNumber.substring(2,blockNumber.length()-1);
		}
	
		public String getBlockNumber() {
			return this.blockNumber;
		}
	
		public void setBlockNumber(String newBlockNumber) {
			this.blockNumber = newBlockNumber;
		}

}

