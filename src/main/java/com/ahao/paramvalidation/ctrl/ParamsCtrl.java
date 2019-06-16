package com.ahao.paramvalidation.ctrl;

import com.ahao.paramvalidation.to.ResultDTO;
import com.ahao.paramvalidation.vo.UserVO;
import com.alibaba.fastjson.JSONObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author ahao
 * @since 2019/6/12 20:06
 **/
@RestController
@RequestMapping("/param")
public class ParamsCtrl {
    private static final Logger LOGGER = LoggerFactory.getLogger(ParamsCtrl.class);

    @PostMapping("/post")
    public ResultDTO paramsValidation(@RequestBody @Validated UserVO userVO, BindingResult bindingResult) {
        LOGGER.info("param is : {}", JSONObject.toJSONString(userVO));
        if (bindingResult.hasErrors()) {
            String err = bindingResult.getFieldError().getDefaultMessage();
            return new ResultDTO("400", "fail", err);
        }
        return new ResultDTO("200", "success", "(●ˇ∀ˇ●)");
    }
}
