package tech.wetech.weshop.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tech.wetech.weshop.mapper.RegionMapper;
import tech.wetech.weshop.domain.Region;
import tech.wetech.weshop.query.RegionPageQuery;
import tech.wetech.weshop.service.RegionService;
import tk.mybatis.mapper.weekend.Weekend;
import tk.mybatis.mapper.weekend.WeekendCriteria;

/**
 * @author cjbi
 */
@Service
public class RegionServiceImpl extends BaseService<Region> implements RegionService {

}
