package test.manager.variables;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class VariablesManager {

	private Map<String,Map<String,Object>> variables;
	
	public void put(String variableName,Object variableValue){
		put(null, variableName, variableValue);
	}
	
	public void put(String namespace,String variableName,Object variableValue){
		if(namespace==null||namespace.equals("")){
			namespace="default";
		}if(variableName==null){
			throw new NullPointerException("variableName can't be null");
		}if(variableValue==null){
			throw new NullPointerException("variableValue can't be null");
		}
		
		Map<String,Object> valueOfNamespace=variables.get(namespace);
		
		if(valueOfNamespace==null){
			valueOfNamespace=new HashMap<String,Object>();
			variables.put(namespace, valueOfNamespace);
		}
		
		valueOfNamespace.put(variableName,variableValue);
	}
	
	public Object get(String variableName){
		return get(null,variableName);
	}
	
	public Object get(String namespace,String variableName){
		if(namespace==null||namespace.equals("")){
			namespace="default";
		}if(variableName==null){
			throw new NullPointerException("variableName can't be null");
		}
		
		Map<String,Object> valueOfNamespace=variables.get(namespace);
		
		if(valueOfNamespace==null){
			return null;
		}
		
		return valueOfNamespace.get(variableName);
	}
	
	/**
	 * 合并一个更加高级的VariablesManager，会保护性拷贝，
	 * 即对这个VariablesManager的修改，并不会影响被复制者
	 * 
	 * @param variablesManager 被合并的那个variablesManager
	 */
	public void merge(VariablesManager variablesManager){
		if(variablesManager==null){
			throw new NullPointerException("variablesManager can't be null");
		}
		
		Map<String,Map<String,Object>> variablesToCopy=variablesManager.variables;
		
		for(Entry<String,Map<String,Object>> entry:variablesToCopy.entrySet()){
			Map<String,Object> map=this.variables.get(entry.getKey());
			
			if(map==null){
				map=new HashMap<>(entry.getValue());
				this.variables.put(entry.getKey(), map);
			}else{
				map.putAll(entry.getValue());
			}
		}
	}
}
