package com.tdc.mpdemo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * mp-demo
 * com.tdc.controller
 * author   taodachuan
 * date     2018/4/23 15:08
 */
@RestController
public class DockerController {

    @RequestMapping("/")
    public String url(){
        String fozu =   "现在是佛祖"+"\n"+
                        "                   _ooOoo_"+"\n"+
                        "                  o8888888o"+"\n"+
                        "                  88\" . \"88"+"\n"+
                        "                  (| -_- |)"+"\n"+
                        "                  O\\  =  /O"+"\n"+
                        "               ____/`---'\\____"+"\n"+
                        "             .'  \\\\|     |//  `."+"\n"+
                        "            /  \\\\|||  :  |||//  \\"+"\n"+
                        "           /  _||||| -:- |||||-  \\"+"\n"+
                        "           |   | \\\\\\  -  /// |   |"+"\n"+
                        "           | \\_|  ''\\---/''  |   |"+"\n"+
                        "           \\  .-\\__  `-`  ___/-. /"+"\n"+
                        "         ___`. .'  /--.--\\  `. . __"+"\n"+
                        "      .\"\" '<  `.___\\_<|>_/___.'  >'\"\"."+"\n"+
                        "     | | :  `- \\`.;`\\ _ /`;.`/ - ` : | |"+"\n"+
                        "     \\  \\ `-.   \\_ __\\ /__ _/   .-` /  /"+"\n"+
                        "======`-.____`-.___\\_____/___.-`____.-'======"+"\n"+
                        "                   `=---='"+"\n"+
                        "^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^"+"\n"+
                        "                 佛祖保佑       永无BUG";
        System.out.println(2);
        return fozu;
    }


}
