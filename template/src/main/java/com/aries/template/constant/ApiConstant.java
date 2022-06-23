package com.aries.template.constant;

/**
 * @Author: AriesHoo on 2018/11/19 14:14
 * @E-Mail: AriesHoo@126.com
 * @Function: 接口地址常量
 * @Description:
 */
public class ApiConstant {

    /** 由纳里平台分配的公司标识，固定写死 */
    public static final String NALI_APPKEY = "app_web";

    /** 由纳里平台分配 第三方平台用户唯一主键 */
    public static final String NALI_TID = "tid_2";

    /** 纳里的加密私钥 */
    public static String NALI_PRIVATE_KEY ="MIICXQIBAAKBgQDeppiicqPIfjLjAzW1VKXjP2BsRGBjwh4nYV0C5tD8z+R0NvnLJo7de5icjhhsNnCDn6NFKtLF4WIL97x38nRgKueAD+LYjCPefJ6tZT513tMen9N8BYiUP8+9EyxSKVsVWdBCZnPEWp0GTSpN1sjv6dhk8PYjndfIHalYSY8YXQIDAQABAoGBAJ55p9SgknEnWiL46uaJPJX2SzRkqtL2nS3cgC6LiZ8Yffw2ETAG3tNIoMR1425KhWU6YCTgKSvNk1L/Xzdk7G0easRzCNRQ6EWm3H+c/UBHcDBVfSKq45SwlJvaVlU8A8c8YCmttEBFrKS2YEWln/U8DUSNkrbAs0ni/dCyOGnlAkEA+21tSJYxW2yY939yVHtsrIttCokBR3hp7sZPHEyAcXuslZ/O62k3k3PMZUWEqaXnhiAnIJWr8yrGpcTobwHfwwJBAOKzMYdtoPOswki5temLj7yyTitY9L27hTEgt+Y7y5/oCmB/P3XZlJOtpnFDu+xdJAnEpu1RuCYUUIs00l/kxV8CQGBLTKucOlMViJBh01vf2YNL8vsx9bd1urykXvArrJXKFBNKHWmz5oEmvIWc1m5TCBUqg1HLgQukumgKviqlwRkCQQCCVR9OivqT3Wi9QveQ04nJpIFIbpYWVq7WdccEeLAyuMbuf3nOmU7QMG+WgqiR1WKYsxR9MBQ84EUGI1Ini3DlAkBHyidb8c92GDPKxHG1NS2lMvAKpEOlWhPS18vtEPA1R0oQnRB942l6gekxSRZPUVpNrFXPheVApbZJLpbUaHpS";

    public static final String API_MOVIE_IN_THEATERS = "v2/movie/in_theaters";
    public static final String API_MOVIE_COMING_SOON = "v2/movie/coming_soon";
    public static final String API_MOVIE_TOP = "v2/movie/top250";
    public static final String API_UPDATE_APP = "update";
    public static final String API_UPDATE_APP_KEY = "update";

    // 获取设备信息接口
    public static final String QueryTermialInfo  =  "api/aio/queryTermialInfo";

    public static  String QueryTermialInfoBaseurl  =  "http://10.100.10.45:18000/api/aio/";

   // 舒心测试接口地址：http://10.100.10.45:18033

    public static  String BASEURL = "http://10.100.10.45:18033/";

    public static  String BASEURLTest = "https://jsbceshi.hfi-health.com:18188/cloudHospital/";

    public static  String DownURL = "http://10.100.10.45:18033/";

//查询激活状态
    public static final String isRegister  =  "ngariUserRelation/isRegister";

    /** 用户信息查询 */
    public static final String findUser  =  "ngariUserRelation/findUser";

    /** 用户注册 */
    public static final String register  =  "ngariUserRelation/register";

    /** 纳里复诊服务接口 */
    public static final String doBaseNgariRequest =  "ngari/revisit/doBaseNgariRequest";

    /** 复诊单和挂号单 */
    public static final String getConsultsAndRecipes  =  "ngari/revisit/getConsultsAndRecipes";




//    http://XXXXX:port/api/activation/queryActive



}
