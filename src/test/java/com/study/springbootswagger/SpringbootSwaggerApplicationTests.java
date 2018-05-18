package com.study.springbootswagger;



import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.net.URI;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringbootSwaggerApplicationTests {

    @Test
    public void contextLoads()  throws Exception{
        /*http对象*/
        CloseableHttpClient httpClient=HttpClients.createDefault();
        /*get请求*/
        HttpGet httpGet=new HttpGet();
        httpGet.setURI(new URI("http://www.baidu.com"));


        /*发送请求*/
        CloseableHttpResponse response=httpClient.execute(httpGet);
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
        String content =EntityUtils.toString(response.getEntity(),
                "UTF-8");
        System.out.println("www:"+content );
        System.out.println("response.getEntity().getContent():"+response.getEntity().getContent());
        System.out.println("response.getEntity().getContentEncoding():"+response.getEntity().getContentEncoding());
        System.out.println("response.getEntity().getContentLength():"+response.getEntity().getContentLength());
        System.out.println("response.getEntity().getContentType():"+response.getEntity().getContentType());
    }

    @Test
    public void test(){
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
        System.out.println();
        System.out.println(((String)null).getClass());
    }

}
