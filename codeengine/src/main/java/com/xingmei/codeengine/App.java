package com.xingmei.codeengine;

import com.xingmei.codeengine.code.DBCodeTool;
import com.xingmei.codeengine.util.ConfigUtil;
import com.xingmei.codeengine.util.freemarker.FreeMarkerUtil;

/**
 *代码生成工具
 *@author JiangZhiYong
 *@date 2015年6月19日15:30:06
 */
public class App
{
    public static void main(String[] args) throws Exception
    {
        App app = new App();
        app.init();

        DBCodeTool.getInstance().generateHibernateBean();   //生成hibernate实体对象
    }

    public void init() {
        ConfigUtil.loadProperties();
        FreeMarkerUtil.getInstance().initConfiguration();
    }
}