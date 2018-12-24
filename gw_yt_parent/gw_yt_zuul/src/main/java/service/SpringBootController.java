package service;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import javafx.print.PaperSource;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Api(value = "网管", description = "网管接口")
@Controller
public class SpringBootController {

    @ApiOperation(value = "获取helloWorld get 方法", notes = "简单SpringMVC请求")
    @RequestMapping(value="/sss",method = RequestMethod.GET)
    @ResponseBody
    String home() {
        return "HELLO WORLD";
    }
    @ApiOperation(value = "获取show 方法",notes = "show  请求")
    @RequestMapping(value = "/show", method = RequestMethod.POST)
    @ResponseBody
    public    String   show(){
      return "ss";
    }
}
