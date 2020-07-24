package keyHolder.vo;

public class PartVO {
	private int partId;
	private String partName;
	
	public int getPartId() {return partId;}
	public void setPartId(int partId) {this.partId = partId;}
	public String getPartName() {return partName;}
	public void setPartName(String partName) {this.partName = partName;}
	
	public PartVO() {}
	
	public PartVO(int partId, String partName) {
		super();
		this.partId = partId;
		this.partName = partName;
	}
	
	@Override
	public String toString() {
		return String.format("PartID : %d, PartName : %s", partId, partName);
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + partId;
		result = prime * result + ((partName == null) ? 0 : partName.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		PartVO other = (PartVO) obj;
		if (partId != other.partId)
			return false;
		if (partName == null) {
			if (other.partName != null)
				return false;
		} else if (!partName.equals(other.partName))
			return false;
		return true;
	}
}
