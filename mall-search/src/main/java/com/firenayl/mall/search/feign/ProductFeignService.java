package com.firenayl.mall.search.feign;

import com.firenay.common.utils.R;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

/**
 * <p>Title: ProductFeignService</p>
 * Description：
 * date：2021/6/22 23:25
 *
 * rpc属于提供方。相当于一个controller 打包上传到服务器后， 可以直接通过@Autowired 引入调用。
 * 参考:https://blog.csdn.net/wind_chasing_boy/article/details/123822427
 *
 */
@FeignClient("mall-product")
public interface ProductFeignService {

	@GetMapping("/product/attr/info/{attrId}")
	R getAttrsInfo(@PathVariable("attrId") Long attrId);

	@GetMapping("/product/brand/infos")
	R brandInfo(@RequestParam("brandIds") List<Long> brandIds);
}
