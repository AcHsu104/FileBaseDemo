package com.test.server;

//import com.e104.entity.ad.Ad;

/**
 * 搜尋的工作
 * 
 * @author kimura.hsieh
 * 
 */
public class SearchedJob extends BaseJob {

	private String NAME;
	private String CUSTNO;
	private String JOB_ADDR_NO_DESCRIPT;
	private String SALARY;
	private String APPLIED;
	private String SAVED;
	private String APPEAR_DATE;
	private String IS_HOTJOB;
	private String CAN_SAVE;
	private String DESCRIPTION;
	private String EXP_EDU;
//	private Ad ad;

	private String IS_PRO;
	
	public String getName() {
		return NAME;
	}

	public String getCustno() {
		return CUSTNO;
	}

	public String getJobAddrNoDescript() {
		return JOB_ADDR_NO_DESCRIPT;
	}

	public String getSalary() {
		return SALARY;
	}

	public String getApplied() {
		return APPLIED;
	}

	public String getSaved() {
		return SAVED;
	}

	public void setSaved(String saved) {
		SAVED = saved;
	}

	public String getAppearDate() {
		return APPEAR_DATE;
	}

	public boolean isHotJOB() {
		return IS_HOTJOB != null && IS_HOTJOB.equals("1");
	}

//	public Ad getAd() {
//		return ad;
//	}
//
//	public void setAd(Ad ad) {
//		this.ad = ad;
//	}

	public String getCAN_SAVE() {
		return CAN_SAVE;
	}

	public void setCAN_SAVE(String cAN_SAVE) {
		CAN_SAVE = cAN_SAVE;
	}

    public String getNAME() {
        return NAME;
    }

    public void setNAME(String nAME) {
        NAME = nAME;
    }

    public String getCUSTNO() {
        return CUSTNO;
    }

    public void setCUSTNO(String cUSTNO) {
        CUSTNO = cUSTNO;
    }

    public String getJOB_ADDR_NO_DESCRIPT() {
        return JOB_ADDR_NO_DESCRIPT;
    }

    public void setJOB_ADDR_NO_DESCRIPT(String jOB_ADDR_NO_DESCRIPT) {
        JOB_ADDR_NO_DESCRIPT = jOB_ADDR_NO_DESCRIPT;
    }

    public String getSALARY() {
        return SALARY;
    }

    public void setSALARY(String sALARY) {
        SALARY = sALARY;
    }

    public String getAPPLIED() {
        return APPLIED;
    }

    public void setAPPLIED(String aPPLIED) {
        APPLIED = aPPLIED;
    }

    public String getSAVED() {
        return SAVED;
    }

    public void setSAVED(String sAVED) {
        SAVED = sAVED;
    }

    public String getAPPEAR_DATE() {
        return APPEAR_DATE;
    }

    public void setAPPEAR_DATE(String aPPEAR_DATE) {
        APPEAR_DATE = aPPEAR_DATE;
    }

    public String getIS_HOTJOB() {
        return IS_HOTJOB;
    }

    public void setIS_HOTJOB(String iS_HOTJOB) {
        IS_HOTJOB = iS_HOTJOB;
    }

    public String getDESCRIPTION() {
        return DESCRIPTION;
    }

    public void setDESCRIPTION(String dESCRIPTION) {
        DESCRIPTION = dESCRIPTION;
    }

    public String getEXP_EDU() {
        return EXP_EDU;
    }

    public void setEXP_EDU(String eXP_EDU) {
        EXP_EDU = eXP_EDU;
    }

	public String getIS_PRO() {
		return IS_PRO;
	}

	public void setIS_PRO(String iS_PRO) {
		IS_PRO = iS_PRO;
	}
	
    
}
