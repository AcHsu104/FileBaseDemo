package com.test.server;

public interface QueryKey {

	String ID_CK = "id_ck";
	String ID_CK_N = "id_ck_n";
	String DEVICE_ID = "device_id";
	String DEVICE_TYPE = "device_type";

	String APP_VERSION = "app_version";
	String FROM_APP_DATE = "from_app_date";
	/**
	 * 關鍵字,例如:java
	 */
	String KWS = "kws";
	/**
	 * 地區類別,例如:6001001001
	 */
	String AREA = "area";
	/**
	 * 職務類別,例如:2007001006
	 */
	String CAT = "cat";
	/**
	 * 工作類型,1:全職 2:兼職 3:高階
	 */
	String ROLE = "role";
	/**
	 * 更新日期,單選->0:本日最新 3:三日內 7:一週內 14:兩週內 30:一個月內
	 */
	String ISNEW = "isnew";
	/**
	 * 排序方式,單選->1:相關性 2:更新日期
	 */
	String ORDER = "order";

	/**
	 * 未加密過的custno
	 */
	String CUSTNO = "custno";
	/**
	 * 加密過的custno
	 */
	String C = "c";

	/**
	 * 未加密過的jobno
	 */
	String JOBNO = "jobno";
	/**
	 * 加密過的jobno
	 */
	String J = "j";

	String FZ = "fz";

	/**
	 * 第幾組配對條件
	 */
	String MATCH_RULE = "rule";

	/**
	 * 公司通知pk
	 */
	String GB_NO = "gb_no";

	/**
	 * 求才企業針對主應發問的問題
	 */
	String APPLY_QUESTION = "apply_question";
	/**
	 * 求職者主應時針對企業求才問題所做的回答
	 */
	String APPLY_ANSWER = "apply_answer";
	/**
	 * 求職者主應時所選擇的自我推薦信
	 */
	String APPLY_MSG = "apply_msg";

	/**
	 * 主應自我推薦信 - pk
	 */
	String RA_ID = "ra_id";
	/**
	 * 主應自我推薦信 - MSG CONTENT
	 */
	String RA_MSG = "ra_msg";

	/**
	 * 履歷表狀態,可能值: on 或 off
	 */
	String STATE = "state";

	String SAVE_JOBNO_LIST = "jobno";
	String UNSAVE_JOBNO_LIST = "unsave";

	String SAVE_CUSTNO_LIST = "custno";
	String UNSAVE_CUSTNO_LIST = "unsave";

	String SUBSCRIBE_CUSTNO_LIST = "custno";
	String UNSUBSCRIBE_CUSTNO_LIST = "unsubscribe";

	String REMOVE_APPLY_NO_LIST = "no";
	String REMOVE_BROWSE_NO_LIST = "no";
	String REMOVE_DISPATCH_NO_LIST = "no";
	String REMOVE_GB_NO_LIST = "no";

	String UNREAD = "unread";
	String PUSH = "push";

	/**
	 * 主動應徵紀錄之廠商讀取狀態,單選->0:廠商未讀取 1:廠商已讀取
	 */
	String CHECK_READ = "check_read";

	String ID_NAME = "id_name";
	String PASSWORD = "password";
	String PERSISTENT_LOGIN = "persistent_login";

	/**
	 * 第幾頁
	 */
	String PAGE = "page";
	/**
	 * 每頁幾筆
	 */
	String PAGE_SIZE = "pgsz";

	String JOBSOURCE = "jobsource";

	String QUREY_MODE = "query_mode";

	String MOBILE_ENTRANCE = "mobile_entrance";

	String ENABLE_FLING = "enableFling";
	
	String OTHER_JOB = "other_job";
	
	String OTHER_JOB_LINK = "other_job_link";
	
	String OTHER_JOB_TITLE = "other_job_title";
	String C_ROLE = "c_role";
	String C_JOBCAT = "c_jobcat";
	String C_AREACAT = "c_areacat";
	
	String KEYWORD_LIST = "keyword_list";
	String INVOICE_LIST = "invoice_list";

}
