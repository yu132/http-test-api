package test.resource.configs.servers;

import java.util.List;
import java.util.Map;

import org.apache.http.NameValuePair;

public class HttpRequestInformation {

	private String method;
	
	private String path;
	
	private Map<String, String> paramInPath; 
	
	private List<NameValuePair> nvpsInQuery;
	
	private List<NameValuePair> nvpsInBody;
	
	private String jsonInBody;
	
	private Map<String, String> headers;

	public String getMethod() {
		return method;
	}

	public void setMethod(String method) {
		this.method = method;
	}

	public String getPath() {
		return path;
	}

	public void setPath(String path) {
		this.path = path;
	}

	public Map<String, String> getParamInPath() {
		return paramInPath;
	}

	public void setParamInPath(Map<String, String> paramInPath) {
		this.paramInPath = paramInPath;
	}

	public List<NameValuePair> getNvpsInQuery() {
		return nvpsInQuery;
	}

	public void setNvpsInQuery(List<NameValuePair> nvpsInQuery) {
		this.nvpsInQuery = nvpsInQuery;
	}

	public List<NameValuePair> getNvpsInBody() {
		return nvpsInBody;
	}

	public void setNvpsInBody(List<NameValuePair> nvpsInBody) {
		this.nvpsInBody = nvpsInBody;
	}

	public String getJsonInBody() {
		return jsonInBody;
	}

	public void setJsonInBody(String jsonInBody) {
		this.jsonInBody = jsonInBody;
	}

	public Map<String, String> getHeaders() {
		return headers;
	}

	public void setHeaders(Map<String, String> headers) {
		this.headers = headers;
	}
	
}
