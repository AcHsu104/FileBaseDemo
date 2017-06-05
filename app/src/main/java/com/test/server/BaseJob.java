package com.test.server;

abstract public class BaseJob {

	private String JOBNO;
	private String J;
	private String JOB;
	private String OTHER_JOB;
	private String OTHER_JOB_LINK;
	private String OTHER_JOB_TITLE;
	
	public String getJobno() {
		return JOBNO;
	}

	public void setJobno(String jobno) {
		JOBNO = jobno;
	}

	public String getJ() {
		return J;
	}

	public String getJob() {
		return JOB;
	}
	
	public void setJob(String jobName) {
		JOB = jobName;
	}

	public String getOTHER_JOB() {
		return OTHER_JOB;
	}

	public void setOTHER_JOB(String oTHER_JOB) {
		OTHER_JOB = oTHER_JOB;
	}

	public String getOTHER_JOB_LINK() {
		return OTHER_JOB_LINK;
	}

	public void setOTHER_JOB_LINK(String oTHER_JOB_LINK) {
		OTHER_JOB_LINK = oTHER_JOB_LINK;
	}

	public String getOTHER_JOB_TITLE() {
		return OTHER_JOB_TITLE;
	}

	public void setOTHER_JOB_TITLE(String oTHER_JOB_TITLE) {
		OTHER_JOB_TITLE = oTHER_JOB_TITLE;
	}

}
