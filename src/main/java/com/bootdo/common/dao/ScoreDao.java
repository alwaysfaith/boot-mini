package com.bootdo.common.dao;

import com.bootdo.common.domain.ScoreDO;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

/**
 * 
 * @author chglee
 * @email 1992lcg@163.com
 * @date 2019-01-04 14:59:46
 */
@Mapper
public interface ScoreDao {

	ScoreDO get(Long betId);
	
	List<ScoreDO> list(Map<String, Object> map);
	
	int count(Map<String, Object> map);
	
	int save(ScoreDO score);
	
	int update(ScoreDO score);
	
	int remove(Long bet_id);
	
	int batchRemove(Long[] betIds);
}
