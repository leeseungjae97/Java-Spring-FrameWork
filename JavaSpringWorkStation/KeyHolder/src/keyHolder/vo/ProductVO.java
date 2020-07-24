package keyHolder.vo;

public class ProductVO {
	private int productId;
	private String productName;
	private int productPrice;
	private int partId;
	private PartVO part;
	//Part정보와 함께 제품정보도 가져오고싶다면 두번 Query를 해야한다.
	//그러나 PartVO를 ProductVO에서 가지고있다면 한번에 가져올 수 있다.
	
	public ProductVO() {
		this(0, null, 0, 0);
	}
	

	public ProductVO(int productId, String productName, int productPrice, int partId) {
		this(productId, productName, productPrice, partId, null);
	}

	public ProductVO(int productId, String productName, int productPrice, int partId, PartVO part) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.productPrice = productPrice;
		this.partId = partId;
		this.part = part;
	}

	public int getProductId() {return productId;}
	public void setProductId(int productId) {this.productId = productId;}
	public String getProductName() {return productName;}
	public void setProductName(String productName) {this.productName = productName;}
	public int getProductPrice() {return productPrice;}
	public void setProductPrice(int productPrice) {this.productPrice = productPrice;}
	public int getPartId() {return partId;}
	public void setPartId(int partId) {this.partId = partId;}
	public PartVO getPart() {return part;}
	public void setPart(PartVO part) {this.part = part;}

	@Override
	public String toString() {
		return "ProductVO [productId=" + productId + ", productName=" + productName + ", productPrice=" + productPrice
				+ ", partId=" + partId + ", part=" + part + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((part == null) ? 0 : part.hashCode());
		result = prime * result + partId;
		result = prime * result + productId;
		result = prime * result + ((productName == null) ? 0 : productName.hashCode());
		result = prime * result + productPrice;
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
		ProductVO other = (ProductVO) obj;
		if (part == null) {
			if (other.part != null)
				return false;
		} else if (!part.equals(other.part))
			return false;
		if (partId != other.partId)
			return false;
		if (productId != other.productId)
			return false;
		if (productName == null) {
			if (other.productName != null)
				return false;
		} else if (!productName.equals(other.productName))
			return false;
		if (productPrice != other.productPrice)
			return false;
		return true;
	}
}
