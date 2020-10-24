package com.Sukidesyo.community.util;

import com.aliyun.oss.OSS;
import com.aliyun.oss.OSSClientBuilder;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
@Component
public class OSSUtil {
        @Value("${oss.url}")
        private  String url;
        @Value("${oss.bucket}")
        private  String bucketName;
        @Value("${oss.key}")
        private  String key;
        @Value("${oss.secret}")
        private  String secret;

    public OSS getBucketOSS()
    {
        System.out.println(bucketName);
        System.out.println(secret);
        OSS ossClient = new OSSClientBuilder().build(url, key, secret);
        return ossClient;
    }
}
