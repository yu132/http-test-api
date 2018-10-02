package test.resource.configs.servers;

public class ServerConfig {

	private String scheme;
	
	private String host;

	private Integer port;

	public ServerConfig(String scheme, String host, Integer port) {
		super();
		this.scheme = scheme;
		this.host = host;
		this.port = port;
	}

	public String getScheme() {
		return scheme;
	}

	public String getHost() {
		return host;
	}

	public Integer getPort() {
		return port;
	}
	
}
