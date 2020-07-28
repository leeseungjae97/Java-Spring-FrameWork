package kr.co.lectopia.vo;

public class SearchVO {
	private String word;
	private int page;
	private int pageSize;
	
	public SearchVO() {}

	public SearchVO(String word, int page, int pageSize) {
		super();
		this.word = word;
		this.page = page;
		this.pageSize = pageSize;
	}

	public String getWord() {
		return word;
	}

	public void setWord(String word) {
		this.word = word;
	}

	public int getPage() {
		return page;
	}

	public void setPage(int page) {
		this.page = page;
	}

	public int getPageSize() {
		return pageSize;
	}

	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}
	
}
