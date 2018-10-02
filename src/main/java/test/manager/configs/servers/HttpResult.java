package test.manager.configs.servers;

public class HttpResult {

	private int stateCode;
	
	private String responseHead;
	
	private String responseBody;

	public HttpResult(int stateCode, String responseHead, String responseBody) {
		super();
		this.stateCode = stateCode;
		this.responseHead = responseHead;
		this.responseBody = responseBody;
	}

	public int getStateCode() {
		return stateCode;
	}

	public String getResponseHead() {
		return responseHead;
	}

	public String getResponseBody() {
		return responseBody;
	}
	
}
