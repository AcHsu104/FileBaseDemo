package com.test.server;

//import com.e104.entity.ad.Ad;
//import com.e104.entity.job.SearchJobListArea;
//import com.e104.entity.job.SearchJobListJobCategory;

/**
 * 結果集
 * 
 * @author kimura.hsieh
 * 
 * @param <T>
 */
public class Result<T> {

	private int totalCount;
	private int totalPage;
	private int pageCount;
	private T list;

	private String errorNo = "";
	private String errorTitle = "";
	private String errorMsg = "";

	private String errID = "0";
	private boolean isSuccess = false;

//	private List<Ad> adList;
//
//	private List<SearchJobListJobCategory> jclist;
//	private List<SearchJobListArea> arealist;
	public Result(int totalCount, int totalPage, T list) {
		this.totalCount = totalCount;
		this.totalPage = totalPage;
		this.list = list;
	}

	/**
	 * 取得總筆數
	 * 
	 * @return
	 */
	public int getTotalCount() {
		return totalCount;
	}

	/**
	 * 取得總頁數
	 * 
	 * @return
	 */
	public int getTotalPage() {
		return totalPage;
	}

	/**
	 * 取得列表集
	 * 
	 * @return
	 */
	public T getList() {
		return list;
	}

	public void setErrorNo(String errorNo) {
		this.errorNo = errorNo;
	}

	public String getErrorNo() {
		return errorNo;
	}

	public void setErrorMsg(String errorMsg) {
		this.errorMsg = errorMsg;
	}

	public String getErrorMsg() {
		return errorMsg;
	}

	public void setErrorTitle(String errorTitle) {
		this.errorTitle = errorTitle;
	}

	public String getErrorTitle() {
		return errorTitle;
	}

//	public void setAd(List<Ad> adList) {
//		this.adList = adList;
//	}
//
//	public List<Ad> getAdList() {
//		return adList;
//	}

	public void setSuccess(boolean isSuccess) {
		this.isSuccess = isSuccess;
	}

	public boolean isSuccess() {
		return isSuccess;
	}

	public String getErrID() {
		return errID;
	}

	public void setErrID(String errID) {
		this.errID = errID;
	}

//	public void setJCList(List<SearchJobListJobCategory> jclist) {
//		this.jclist = jclist;
//	}
//
//	public List<SearchJobListJobCategory> getJCList() {
//		return jclist;
//	}
//	public void setAreaList(List<SearchJobListArea> arealist) {
//		this.arealist =arealist;
//	}
//	public List<SearchJobListArea> getAreaList() {
//		return arealist;
//	}

    public int getPageCount() {
        return pageCount;
    }

    public void setPageCount(int pageCount) {
        this.pageCount = pageCount;
    }
	
	
}
