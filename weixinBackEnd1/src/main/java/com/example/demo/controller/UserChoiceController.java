package com.example.demo.controller;

import com.example.demo.model.in.UserChoiceInModel;
import com.example.demo.model.out.JsonResult;
import com.example.demo.service.IUserService;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by count on 2018/5/23.
 */
@RestController
@RequestMapping("/userChoice")
public class UserChoiceController {
    public final static Logger logger = LoggerFactory.getLogger(UserChoiceController.class);

    @Autowired
    IUserService userService;

    /**
     * 用户在使用复星白条之前的申请
     * @param request
     * @param inModel
     * @return
     */
    @ApiOperation(value = "用户在使用复星白条之前的申请", notes = "{version}请使用“v4060”，其他参数请参考request和response的examples", tags = "Shuangyi")
    @RequestMapping(value = "/applyFosunCredit/{version}", method = RequestMethod.POST)
    public ResponseEntity<JsonResult> applyFosunCredit(HttpServletRequest request, @ApiParam(value = "账单明细输入参数", required = true)@RequestBody UserChoiceInModel inModel,
                                                       @ApiParam(value = "接口版本号", required = true) @PathVariable("version") String version) throws Exception {
        JsonResult r = new JsonResult();
        r.setStatus("error");
        try {
            switch (version) {
                case "v0000":
                    userService.insertUserChoice(inModel);
                    r.setStatus("ok");
                    break;
                default:
                    r.setResult("无效的URL版本号!");
                    return ResponseEntity.ok(r);
            }
        } catch (Exception ex) {
            logger.error(ex.getMessage(), ex);
            return ResponseEntity.ok(r);
        }
        return ResponseEntity.ok(r);
    }

}
