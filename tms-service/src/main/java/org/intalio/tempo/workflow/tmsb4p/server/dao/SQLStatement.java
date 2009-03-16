package org.intalio.tempo.workflow.tmsb4p.server.dao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SQLStatement {
	private List<String> selectClause = null;
	private List<String> fromClause = null;
	private List<String> whereClause = null;
	private Map<Integer, Object> paraValues = null;
	
	public List<String> getSelectClause() {
		return selectClause;
	}
	public void setSelectClause(List<String> selectClause) {
		this.selectClause = selectClause;
	}
	public List<String> getFromClause() {
		return fromClause;
	}
	public void setFromClause(List<String> fromClause) {
		this.fromClause = fromClause;
	}
	public List<String> getWhereClause() {
		return whereClause;
	}
	public void setWhereClause(List<String> whereClause) {
		this.whereClause = whereClause;
	}
	public Map<Integer, Object> getParaValues() {
		return paraValues;
	}
	public void setParaValues(Map<Integer, Object> paraValues) {
		this.paraValues = paraValues;
	}
	
	public void addSelectClause(String clause) {
		if (selectClause == null) {
			selectClause = new ArrayList<String>();
		}
		
		this.selectClause.add(clause);
	}
	
	public void addFromClause(String clause) {
		if (fromClause == null) {
			fromClause = new ArrayList<String>();
		}
		
		this.fromClause.add(clause);
	}
	
	public void addWhereClause(String clause) {
		if (whereClause == null) {
			whereClause = new ArrayList<String>();
		}
		
		this.whereClause.add(clause);
	}
	
	public void addParaValue(int idx, Object value) {
		if (paraValues == null) {
			paraValues = new HashMap<Integer, Object>();
		}
		
		paraValues.put(idx, value);
	}
	
	public String toString() {
		StringBuffer result = new StringBuffer();
		
		result.append("select distinct ");
		// select clause
		for (int i = 0; i < this.selectClause.size(); i++) {
			if (i == 0) {
				result.append(selectClause.get(i));
			} else {
				result.append("," + selectClause.get(i));
			}
		}
		
		// from clause
		result.append(" from ");
		for (int i = 0; i < this.fromClause.size(); i++) {
			if (i == 0) {
				result.append(fromClause.get(i));
			} else {
				result.append("," + fromClause.get(i));
			}
		}
		
		// where clause
		if (whereClause != null) {
			result.append(" where ");
			for (int i = 0; i < this.whereClause.size(); i++) {
				if (i == 0) {
					result.append(whereClause.get(i));
				} else {
					result.append(" and " + whereClause.get(i));
				}
			}
		}
		
		return result.toString();
	}
}